/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dialogic.XMSClientLibrary;

/**
 *
 * @author dwolansk
 */
public class XMSConferenceOptions {

    public String m_MaxParties = "9";
    public XMSMediaType m_MediaType = XMSMediaType.VIDEO;
    public Layout m_Layout = Layout.AUTO; 
    public boolean m_CaptionEnabled = true;
    public String m_CaptionDuration = "20s";
    public boolean m_BeepEnabled = true;
    public boolean m_DigitClampingEnabled = true;
    public boolean m_AGCEnabled = true;
    public boolean m_ECEnabled = true;
    boolean m_DestroyWhenEmpty = true;
    public String m_active_talker_interval = "500ms";
    public String m_active_talker_region = "";
    public XMSConfMixingMode m_mixingMode;
    public XMSLayoutSizeOption m_layoutSizeOption;
   
    public XMSConferenceOptions() {
        Reset();
    }

    public void Reset() {
        m_MaxParties = "9";
        m_MediaType = XMSMediaType.VIDEO;
        m_Layout = Layout.AUTO; 
        m_CaptionEnabled = true;
        String m_CaptionDuration = "20s";
        m_BeepEnabled = true;
        m_DigitClampingEnabled = true;
        m_AGCEnabled = true;
        m_ECEnabled = true;
        m_DestroyWhenEmpty = true;
        m_active_talker_interval = "500ms";
        m_active_talker_region = "";
        m_mixingMode = XMSConfMixingMode.MCU;
        m_layoutSizeOption = XMSLayoutSizeOption.AUTOMATIC;
    }

    public void SetMaxParties(int a_maxparties) {
        m_MaxParties = "" + a_maxparties;
    }

    public void SetMediaType(XMSMediaType a_type) {
        m_MediaType = a_type;
    }

    public void SetLayout(Layout a_layout) {
        //TODO ENUM the layout for conferencing
        m_Layout = a_layout;
    }

    public void EnableCaption(boolean a_isenabled) {
        m_CaptionEnabled = a_isenabled;
    }

    public void SetCaptionDuration(String a_duration) {
        m_CaptionDuration = a_duration;
    }

    public void EnableBeep(boolean a_isenabled) {
        m_BeepEnabled = a_isenabled;
    }

    public void EnableDigitClamping(boolean a_isenabled) {
        m_DigitClampingEnabled = a_isenabled;
    }

    public void EnableAutoGainControl(boolean a_isenabled) {
        m_AGCEnabled = a_isenabled;
    }

    public void EnableEchoCancellation(boolean a_isenabled) {
        m_ECEnabled = a_isenabled;
    }
  /**
      * Enable the delete of the conference when the last party
      * is removed
      * @param a_isenabled 
      */
     public void EnableDestroyWhenEmpty(boolean a_isenabled){
         m_DestroyWhenEmpty=a_isenabled;
     }
     
     public void SetActiveTalkerInterval(String a_interval) {
        m_active_talker_interval = a_interval;
    }
     
     public void SetActiveTalkerRegion(String a_region) {
        m_active_talker_region = a_region;
    }

    public void SetMixingMode(XMSConfMixingMode a_mixingMode) {
        m_mixingMode = a_mixingMode;
    }

    public void SetLayoutSizeOption(XMSLayoutSizeOption a_layoutSizeOption) {
        m_layoutSizeOption = a_layoutSizeOption;
    }

    @Override
    public String toString() {
        return "m_MaxParties=" + m_MaxParties
                + " m_MediaType=" + m_MediaType
                + " m_Layout=" + m_Layout
                + " m_CaptionEnabled=" + m_CaptionEnabled
                + " m_CaptionDuration=" + m_CaptionDuration
                + " m_BeepEnabled=" + m_BeepEnabled
                + " m_DigitClampingEnabled=" + m_DigitClampingEnabled
                + " m_AGCEnabled=" + m_AGCEnabled
                + " m_ECEnabled="+m_ECEnabled
                + " m_DestroyWhenEmpty="+m_DestroyWhenEmpty
                + " m_active_talker_interval="+m_active_talker_interval
                + " m_active_talker_region="+m_active_talker_region;
    }

}
