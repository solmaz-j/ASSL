package generatedbyassl.as;

/**
 * Generated by ASSL Framework
 * 
 * This is the superclass for all ASSL AE BEHAVIOR_MODEL.
 */
public class ASSLBEHAVIOR_MODEL
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * Applies the behavior model.
	 */
	public synchronized void apply (  )
	{
		String sMsg = "BEHAVIOR_MODEL '" + this.getClass().getName() + "': has been applied";
		System.out.println( sMsg );
		//********************************************************
		//**** This method should be overridden by descendant classes
	}

}