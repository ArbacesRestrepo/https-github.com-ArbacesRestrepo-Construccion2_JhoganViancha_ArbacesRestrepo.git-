package App.Service.Intefaces;

/**
 * @author Arbaces Restrepo, Jhogan Viancha
 */

import App.Dto.PartnerDto;
import App.Dto.GuestDto;

public interface InvoiceServiceInterface {
    public void createInvoice( ) throws Exception;
    public void createPartnerInvoice( PartnerDto partnerDto ) throws Exception;
    public void createGuestInvoice( GuestDto guestDto ) throws Exception;
    
    public void historyInvoice( ) throws Exception;
    public void historyPartnerInvoice( PartnerDto partnerDto ) throws Exception;
    public void historyGuestInvoice( GuestDto guestDto ) throws Exception;
}