/*
 * This file is generated by jOOQ.
*/
package ru.ibase.fbjavaex.exampledb.tables.records;


import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;

import ru.ibase.fbjavaex.exampledb.tables.Webuserinrole;


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
public class WebuserinroleRecord extends UpdatableRecordImpl<WebuserinroleRecord> implements Record3<Integer, Integer, Integer> {

    private static final long serialVersionUID = 1675651307;

    /**
     * Setter for <code>WEBUSERINROLE.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>WEBUSERINROLE.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>WEBUSERINROLE.WEBUSER_ID</code>.
     */
    public void setWebuserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>WEBUSERINROLE.WEBUSER_ID</code>.
     */
    public Integer getWebuserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>WEBUSERINROLE.WEBROLE_ID</code>.
     */
    public void setWebroleId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>WEBUSERINROLE.WEBROLE_ID</code>.
     */
    public Integer getWebroleId() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Webuserinrole.WEBUSERINROLE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Webuserinrole.WEBUSERINROLE.WEBUSER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Webuserinrole.WEBUSERINROLE.WEBROLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getWebuserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getWebroleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebuserinroleRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebuserinroleRecord value2(Integer value) {
        setWebuserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebuserinroleRecord value3(Integer value) {
        setWebroleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebuserinroleRecord values(Integer value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WebuserinroleRecord
     */
    public WebuserinroleRecord() {
        super(Webuserinrole.WEBUSERINROLE);
    }

    /**
     * Create a detached, initialised WebuserinroleRecord
     */
    public WebuserinroleRecord(Integer id, Integer webuserId, Integer webroleId) {
        super(Webuserinrole.WEBUSERINROLE);

        set(0, id);
        set(1, webuserId);
        set(2, webroleId);
    }
}
