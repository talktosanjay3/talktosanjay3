package com.tcs.nga;

import java.math.BigInteger;

public class UserDetailsBean {

	private TimeoutOverlayData TimeoutOverlayData = new TimeoutOverlayData();

	private boolean isCustomer = true;

	private String welcomeCustomer = "Bienvenido(a) EDUARDO MENDEZ URQUIZA";

	private String windowId = "1545675666193";

	private BigInteger renew = new BigInteger("1545678151021");

	private String lastAccess = "Último acceso: 24 ago 2017 a las 4:25:26 por BANCANET.";

	private String timeNew = "480";

	public TimeoutOverlayData getTimeoutOverlayData ()
	{
		return TimeoutOverlayData;
	}

	public void setTimeoutOverlayData (TimeoutOverlayData TimeoutOverlayData)
	{
		this.TimeoutOverlayData = TimeoutOverlayData;
	}

	public boolean isCustomer() {
		return isCustomer;
	}

	public void setCustomer(boolean isCustomer) {
		this.isCustomer = isCustomer;
	}

	public String getWelcomeCustomer ()
	{
		return welcomeCustomer;
	}

	public void setWelcomeCustomer (String welcomeCustomer)
	{
		this.welcomeCustomer = welcomeCustomer;
	}

	public String getWindowId ()
	{
		return windowId;
	}

	public void setWindowId (String windowId)
	{
		this.windowId = windowId;
	}


	public String getLastAccess ()
	{
		return lastAccess;
	}

	public void setLastAccess (String lastAccess)
	{
		this.lastAccess = lastAccess;
	}

	public String getTimeNew ()
	{
		return timeNew;
	}

	public void setTimeNew (String timeNew)
	{
		this.timeNew = timeNew;
	}
	
	public BigInteger getRenew() {
		return renew;
	}

	public void setRenew(BigInteger renew) {
		this.renew = renew;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [TimeoutOverlayData = "+TimeoutOverlayData+", isCustomer = "+isCustomer+", welcomeCustomer = "+welcomeCustomer+", windowId = "+windowId+", renew = "+renew+", lastAccess = "+lastAccess+", timeNew = "+timeNew+"]";
	}
}
