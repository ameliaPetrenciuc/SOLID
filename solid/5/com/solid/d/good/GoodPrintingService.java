package com.solid.d.good;

import com.solid.i.ComplexInvoice;
import com.solid.i.Invoice;
import com.solid.i.good.GoodInvoicePrinter;
import com.solid.i.good.GoodInvoicePrinter_I;

public class GoodPrintingService {

    private GoodInvoicePrinter_I goodInvoicePrinter;
    public GoodPrintingService(GoodInvoicePrinter_I goodInvoicePrinter){
        this.goodInvoicePrinter=goodInvoicePrinter;
    }

    public void print(Invoice invoice) {
        goodInvoicePrinter.print(invoice);
    }

}
