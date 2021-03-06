package generatedbyassl.as;

import java.io.Serializable;
import java.util.Hashtable;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'ASIP' (specified as ASIP ASSL tier).
 */
public class ASIP
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'ASIP' class.
	 */
	static private ASIP oInstance = null;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Needed by the class because it implements the Serializable interface.
	 */
	static final long serialVersionUID = 0001L;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds pairs 'message name'-'message reference' of all the messages specified by ASIP.
	 */
	public Hashtable<String, ASSLMESSAGE> MESSAGES = new Hashtable<String, ASSLMESSAGE>();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds pairs 'channel name'-'channel reference' of all the channels specified by ASIP.
	 */
	public Hashtable<String, ASSLCHANNEL> CHANNELS = new Hashtable<String, ASSLCHANNEL>();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds pairs 'function name'-'function reference' of all the functions specified by ASIP.
	 */
	public Hashtable<String, ASSLFUNCTION> FUNCTIONS = new Hashtable<String, ASSLFUNCTION>();

	/**
	 * Generated by ASSL Framework
	 * 
	 * Because this is a singleton class its constructor is private.
	 */
	private  ASIP (  )
	{
		MESSAGES.put( "MSGBUFFERFULL", generatedbyassl.as.asip.messages.MSGBUFFERFULL.getInstance() );
		CHANNELS.put( "BUFFERFULLNOTIFICATION", generatedbyassl.as.asip.channels.BUFFERFULLNOTIFICATION.getInstance() );
		FUNCTIONS.put( "SENDNOTIFICATION", generatedbyassl.as.asip.functions.SENDNOTIFICATION.getInstance() );
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'ASIP' class.
	 */
	static public ASIP getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new ASIP();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Returns a reference to a message specified by name.
	 */
	public ASSLMESSAGE getMessage ( String psMessageName )
	{
		return MESSAGES.get(psMessageName);
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Returns a reference to a channel specified by name.
	 */
	public ASSLCHANNEL getChannel ( String psChannelName )
	{
		return CHANNELS.get(psChannelName);
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Returns a reference to a function specified by name.
	 */
	public ASSLFUNCTION getFunction ( String psFunctionName )
	{
		return FUNCTIONS.get(psFunctionName);
	}

}