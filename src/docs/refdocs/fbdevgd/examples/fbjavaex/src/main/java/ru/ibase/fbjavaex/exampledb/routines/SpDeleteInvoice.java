/*
 * This file is generated by jOOQ.
*/
package ru.ibase.fbjavaex.exampledb.routines;


import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;

import ru.ibase.fbjavaex.exampledb.DefaultSchema;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SpDeleteInvoice extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -1427224268;

    /**
     * The parameter <code>SP_DELETE_INVOICE.INVOICE_ID</code>.
     */
    public static final Parameter<Integer> INVOICE_ID = createParameter("INVOICE_ID", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public SpDeleteInvoice() {
        super("SP_DELETE_INVOICE", DefaultSchema.DEFAULT_SCHEMA);

        addInParameter(INVOICE_ID);
    }

    /**
     * Set the <code>INVOICE_ID</code> parameter IN value to the routine
     */
    public void setInvoiceId(Integer value) {
        setValue(INVOICE_ID, value);
    }
}
