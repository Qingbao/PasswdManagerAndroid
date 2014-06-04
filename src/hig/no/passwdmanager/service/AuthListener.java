
package hig.no.passwdmanager.service;

import hig.no.passwdmanager.event.AAEvent;
import hig.no.passwdmanager.event.BACEvent;
import hig.no.passwdmanager.event.EACEvent;



/**
 * Listener for authentication events.
 * 
 * 
 */
public interface AuthListener {

   /**
    * Called when an attempt was made to perform the BAC protocol.
    *
    * @param be contains the resulting wrapper
    */
   public void performedBAC(BACEvent be);
   
   /**
    * Called when an attempt was made to perform the AA protocol.
    *
    * @param ae contains the used public key and resulting status of the protocol 
    */
   public void performedAA(AAEvent ae);

   /**
    * Called when an attempt was made to perform the EAC protocol.
    *
    * @param ae contains the used public key and resulting status of the protocol 
    */
   public void performedEAC(EACEvent ae);

}

