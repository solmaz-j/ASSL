package generatedbyassl.as.aes.producer.aeself_management;

import java.io.Serializable;
import generatedbyassl.as.ASSLPOLICY;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'SELF_HEALING' (specified as SELF_HEALING ASSL tier).
 */
public class SELF_HEALING
	extends ASSLPOLICY
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'SELF_HEALING' class.
	 */
	static private SELF_HEALING oInstance = null;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Needed by the class because it implements the Serializable interface.
	 */
	static final long serialVersionUID = 0001L;

	/**
	 * Generated by ASSL Framework
	 * 
	 * Because this is a singleton class its constructor is private.
	 */
	private  SELF_HEALING (  )
	{
		vFluents.put( "INSENDING", generatedbyassl.as.aes.producer.aeself_management.self_healing.INSENDING.getInstance() );
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'SELF_HEALING' class.
	 */
	static public SELF_HEALING getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new SELF_HEALING();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * For each specified MAPPING, checks if the MAPPING conditions are fulfilled and if so spawn a thread to perform the MAPPING actions.
	 */
	public synchronized void doAllMappings (  )
	{
		//************************ MAPPING ***********************
		if ( generatedbyassl.as.aes.producer.aeself_management.self_healing.INSENDING.getInstance().isFluentInitiated() ) 
		{
			//**** runs a thread that performs the actions mapped to these fluents
			Runnable actionsRunner = new Runnable()
			{
				/**
				 * Generated by ASSL Framework
				 * 
				 * This method runs the mapping thread until all the mapped actions have been performed.
				 */
				public void run (  )
				{
					try
					{
						generatedbyassl.as.aes.producer.actions.SEND.getInstance().perform(  );
					}
					catch ( Exception ex ) 
					{
						System.err.println( ex.getMessage() );
					}
				}

			};
			//**** creates and starts the thread if the latter is not currently running
			if ( !isMappingRunning( "INSENDING" ) ) 
			{
				Thread runActions = new Thread(thrdgrMappings, actionsRunner, "INSENDING");
				runActions.start();
			}
		}
	}

}