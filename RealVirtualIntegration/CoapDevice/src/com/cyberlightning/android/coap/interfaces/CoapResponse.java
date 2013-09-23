package com.cyberlightning.android.coap.interfaces;

import com.cyberlightning.android.coap.message.CoapResponseCode;


/**
 * @author Christian Lerche <christian.lerche@uni-rostock.de>
 */

public interface CoapResponse extends CoapMessage{
	
	/* TODO: Response Code is part of BasicCoapResponse */
	public CoapResponseCode getResponseCode();
	public void setMaxAge(int maxAge);
    public long getMaxAge();
    
    public void setETag(byte[] etag);
    public byte[] getETag();
    public void setResponseCode(CoapResponseCode responseCode);

		
}