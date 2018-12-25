package com.tcs.nga;

public class TimeoutOverlayData
{
    private String timeoutTime = "01:59 (mm:ss)";

    private String primaryButton = "CONTINUAR";

    private String timeoutText2 = "finalizar&aacute; en:";

    private String overlayHeader = "Tiempo de sesión por finalizar";

    private String timeoutText3 = "Si deseas extender el tiempo de sesi&oacute;n haz clic en &quot;Continuar&quot;.";

    private String timeoutText1 = "Por tu seguridad y debido a que no has realizado ninguna operación, la sesi&oacute;n";

    private String redIconText = "&iquest;Qu&eacute; puedo hacer?";

    public String getTimeoutTime ()
    {
        return timeoutTime;
    }

    public void setTimeoutTime (String timeoutTime)
    {
        this.timeoutTime = timeoutTime;
    }

    public String getPrimaryButton ()
    {
        return primaryButton;
    }

    public void setPrimaryButton (String primaryButton)
    {
        this.primaryButton = primaryButton;
    }

    public String getTimeoutText2 ()
    {
        return timeoutText2;
    }

    public void setTimeoutText2 (String timeoutText2)
    {
        this.timeoutText2 = timeoutText2;
    }

    public String getOverlayHeader ()
    {
        return overlayHeader;
    }

    public void setOverlayHeader (String overlayHeader)
    {
        this.overlayHeader = overlayHeader;
    }

    public String getTimeoutText3 ()
    {
        return timeoutText3;
    }

    public void setTimeoutText3 (String timeoutText3)
    {
        this.timeoutText3 = timeoutText3;
    }

    public String getTimeoutText1 ()
    {
        return timeoutText1;
    }

    public void setTimeoutText1 (String timeoutText1)
    {
        this.timeoutText1 = timeoutText1;
    }

    public String getRedIconText ()
    {
        return redIconText;
    }

    public void setRedIconText (String redIconText)
    {
        this.redIconText = redIconText;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [timeoutTime = "+timeoutTime+", primaryButton = "+primaryButton+", timeoutText2 = "+timeoutText2+", overlayHeader = "+overlayHeader+", timeoutText3 = "+timeoutText3+", timeoutText1 = "+timeoutText1+", redIconText = "+redIconText+"]";
    }
}
