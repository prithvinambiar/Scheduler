package com.mycompany.api;

import com.mycompany.model.Invoice;

public interface IApiGateway {
    int CreateInvoice(Invoice invoice);
}
