package cn.com.mjsoft.cms.questionnaire.bean;

import java.util.Date;

public class SurveyVoteInfoBean
{
    private Long optId;
    private Long surveyId;
    private String voteText;
    private String voteMan;
    private String ip;
    private Date voteDate;

    public String getIp()
    {
        return ip;
    }

    public void setIp( String ip )
    {
        this.ip = ip;
    }

    public Long getOptId()
    {
        return optId;
    }

    public void setOptId( Long optId )
    {
        this.optId = optId;
    }

    public Long getSurveyId()
    {
        return surveyId;
    }

    public void setSurveyId( Long surveyId )
    {
        this.surveyId = surveyId;
    }

    public Date getVoteDate()
    {
        return voteDate;
    }

    public void setVoteDate( Date voteDate )
    {
        this.voteDate = voteDate;
    }

    public String getVoteMan()
    {
        return voteMan;
    }

    public void setVoteMan( String voteMan )
    {
        this.voteMan = voteMan;
    }

    public String getVoteText()
    {
        return voteText;
    }

    public void setVoteText( String voteText )
    {
        this.voteText = voteText;
    }

}
