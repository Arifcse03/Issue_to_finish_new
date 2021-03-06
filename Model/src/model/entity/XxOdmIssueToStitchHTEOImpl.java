package model.entity;

import java.sql.CallableStatement;
import java.sql.SQLException;

import java.util.Map;

import oracle.adf.share.ADFContext;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;

import oracle.jdbc.OracleTypes;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun May 23 15:53:24 BDT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxOdmIssueToStitchHTEOImpl extends EntityImpl {
    private static EntityDefImpl mDefinitionObject;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. Do not modify.
     */
    public enum AttributesEnum {
        HeaderId {
            public Object get(XxOdmIssueToStitchHTEOImpl obj) {
                return obj.getHeaderId();
            }

            public void put(XxOdmIssueToStitchHTEOImpl obj, Object value) {
                obj.setHeaderId((Number)value);
            }
        }
        ,
        ChallanNo {
            public Object get(XxOdmIssueToStitchHTEOImpl obj) {
                return obj.getChallanNo();
            }

            public void put(XxOdmIssueToStitchHTEOImpl obj, Object value) {
                obj.setChallanNo((String)value);
            }
        }
        ,
        Unit {
            public Object get(XxOdmIssueToStitchHTEOImpl obj) {
                return obj.getUnit();
            }

            public void put(XxOdmIssueToStitchHTEOImpl obj, Object value) {
                obj.setUnit((Number)value);
            }
        }
        ,
        ChallanType {
            public Object get(XxOdmIssueToStitchHTEOImpl obj) {
                return obj.getChallanType();
            }

            public void put(XxOdmIssueToStitchHTEOImpl obj, Object value) {
                obj.setChallanType((String)value);
            }
        }
        ,
        TotIssueQty {
            public Object get(XxOdmIssueToStitchHTEOImpl obj) {
                return obj.getTotIssueQty();
            }

            public void put(XxOdmIssueToStitchHTEOImpl obj, Object value) {
                obj.setTotIssueQty((Number)value);
            }
        }
        ,
        CreationDate {
            public Object get(XxOdmIssueToStitchHTEOImpl obj) {
                return obj.getCreationDate();
            }

            public void put(XxOdmIssueToStitchHTEOImpl obj, Object value) {
                obj.setCreationDate((Date)value);
            }
        }
        ,
        CreationBy {
            public Object get(XxOdmIssueToStitchHTEOImpl obj) {
                return obj.getCreationBy();
            }

            public void put(XxOdmIssueToStitchHTEOImpl obj, Object value) {
                obj.setCreationBy((Number)value);
            }
        }
        ,
        UpdateDate {
            public Object get(XxOdmIssueToStitchHTEOImpl obj) {
                return obj.getUpdateDate();
            }

            public void put(XxOdmIssueToStitchHTEOImpl obj, Object value) {
                obj.setUpdateDate((Date)value);
            }
        }
        ,
        UpdateBy {
            public Object get(XxOdmIssueToStitchHTEOImpl obj) {
                return obj.getUpdateBy();
            }

            public void put(XxOdmIssueToStitchHTEOImpl obj, Object value) {
                obj.setUpdateBy((Number)value);
            }
        }
        ,
        SentToId {
            public Object get(XxOdmIssueToStitchHTEOImpl obj) {
                return obj.getSentToId();
            }

            public void put(XxOdmIssueToStitchHTEOImpl obj, Object value) {
                obj.setSentToId((Number)value);
            }
        }
        ,
        Flag {
            public Object get(XxOdmIssueToStitchHTEOImpl obj) {
                return obj.getFlag();
            }

            public void put(XxOdmIssueToStitchHTEOImpl obj, Object value) {
                obj.setFlag((String)value);
            }
        }
        ,
        Remarks {
            public Object get(XxOdmIssueToStitchHTEOImpl obj) {
                return obj.getRemarks();
            }

            public void put(XxOdmIssueToStitchHTEOImpl obj, Object value) {
                obj.setRemarks((String)value);
            }
        }
        ,
        UnitName {
            public Object get(XxOdmIssueToStitchHTEOImpl obj) {
                return obj.getUnitName();
            }

            public void put(XxOdmIssueToStitchHTEOImpl obj, Object value) {
                obj.setUnitName((String)value);
            }
        }
        ,
        XxOdmIssueToStitchLTEO {
            public Object get(XxOdmIssueToStitchHTEOImpl obj) {
                return obj.getXxOdmIssueToStitchLTEO();
            }

            public void put(XxOdmIssueToStitchHTEOImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static int firstIndex = 0;

        public abstract Object get(XxOdmIssueToStitchHTEOImpl object);

        public abstract void put(XxOdmIssueToStitchHTEOImpl object,
                                 Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int HEADERID = AttributesEnum.HeaderId.index();
    public static final int CHALLANNO = AttributesEnum.ChallanNo.index();
    public static final int UNIT = AttributesEnum.Unit.index();
    public static final int CHALLANTYPE = AttributesEnum.ChallanType.index();
    public static final int TOTISSUEQTY = AttributesEnum.TotIssueQty.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int CREATIONBY = AttributesEnum.CreationBy.index();
    public static final int UPDATEDATE = AttributesEnum.UpdateDate.index();
    public static final int UPDATEBY = AttributesEnum.UpdateBy.index();
    public static final int SENTTOID = AttributesEnum.SentToId.index();
    public static final int FLAG = AttributesEnum.Flag.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int UNITNAME = AttributesEnum.UnitName.index();
    public static final int XXODMISSUETOSTITCHLTEO = AttributesEnum.XxOdmIssueToStitchLTEO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxOdmIssueToStitchHTEOImpl() {
    }


    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        if (mDefinitionObject == null) {
            mDefinitionObject = EntityDefImpl.findDefObject("model.entity.XxOdmIssueToStitchHTEO");
        }
        return mDefinitionObject;
    }

    /**
     * Gets the attribute value for HeaderId, using the alias name HeaderId.
     * @return the HeaderId
     */
    public Number getHeaderId() {
        return (Number)getAttributeInternal(HEADERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for HeaderId.
     * @param value value to set the HeaderId
     */
    public void setHeaderId(Number value) {
        setAttributeInternal(HEADERID, value);
    }

    /**
     * Gets the attribute value for ChallanNo, using the alias name ChallanNo.
     * @return the ChallanNo
     */
    public String getChallanNo() {
        return (String)getAttributeInternal(CHALLANNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChallanNo.
     * @param value value to set the ChallanNo
     */
    public void setChallanNo(String value) {
        setAttributeInternal(CHALLANNO, value);
    }

    /**
     * Gets the attribute value for Unit, using the alias name Unit.
     * @return the Unit
     */
    public Number getUnit() {
        return (Number)getAttributeInternal(UNIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Unit.
     * @param value value to set the Unit
     */
    public void setUnit(Number value) {
        setAttributeInternal(UNIT, value);
    }

    /**
     * Gets the attribute value for ChallanType, using the alias name ChallanType.
     * @return the ChallanType
     */
    public String getChallanType() {
        return (String)getAttributeInternal(CHALLANTYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChallanType.
     * @param value value to set the ChallanType
     */
    public void setChallanType(String value) {
        setAttributeInternal(CHALLANTYPE, value);
    }

    /**
     * Gets the attribute value for TotIssueQty, using the alias name TotIssueQty.
     * @return the TotIssueQty
     */
    public Number getTotIssueQty() {
        return (Number)getAttributeInternal(TOTISSUEQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for TotIssueQty.
     * @param value value to set the TotIssueQty
     */
    public void setTotIssueQty(Number value) {
        setAttributeInternal(TOTISSUEQTY, value);
    }

    /**
     * Gets the attribute value for CreationDate, using the alias name CreationDate.
     * @return the CreationDate
     */
    public Date getCreationDate() {
        return (Date)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreationDate.
     * @param value value to set the CreationDate
     */
    public void setCreationDate(Date value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for CreationBy, using the alias name CreationBy.
     * @return the CreationBy
     */
    public Number getCreationBy() {
        return (Number)getAttributeInternal(CREATIONBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreationBy.
     * @param value value to set the CreationBy
     */
    public void setCreationBy(Number value) {
        setAttributeInternal(CREATIONBY, value);
    }

    /**
     * Gets the attribute value for UpdateDate, using the alias name UpdateDate.
     * @return the UpdateDate
     */
    public Date getUpdateDate() {
        return (Date)getAttributeInternal(UPDATEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdateDate.
     * @param value value to set the UpdateDate
     */
    public void setUpdateDate(Date value) {
        setAttributeInternal(UPDATEDATE, value);
    }

    /**
     * Gets the attribute value for UpdateBy, using the alias name UpdateBy.
     * @return the UpdateBy
     */
    public Number getUpdateBy() {
        return (Number)getAttributeInternal(UPDATEBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdateBy.
     * @param value value to set the UpdateBy
     */
    public void setUpdateBy(Number value) {
        setAttributeInternal(UPDATEBY, value);
    }

    /**
     * Gets the attribute value for SentToId, using the alias name SentToId.
     * @return the SentToId
     */
    public Number getSentToId() {
        return (Number)getAttributeInternal(SENTTOID);
    }

    /**
     * Sets <code>value</code> as the attribute value for SentToId.
     * @param value value to set the SentToId
     */
    public void setSentToId(Number value) {
        setAttributeInternal(SENTTOID, value);
    }

    /**
     * Gets the attribute value for Flag, using the alias name Flag.
     * @return the Flag
     */
    public String getFlag() {
        return (String)getAttributeInternal(FLAG);
    }

    /**
     * Sets <code>value</code> as the attribute value for Flag.
     * @param value value to set the Flag
     */
    public void setFlag(String value) {
        setAttributeInternal(FLAG, value);
    }


    /**
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the Remarks
     */
    public String getRemarks() {
        return (String)getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
    }

    /**
     * Gets the attribute value for UnitName, using the alias name UnitName.
     * @return the UnitName
     */
    public String getUnitName() {
        return (String)getAttributeInternal(UNITNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for UnitName.
     * @param value value to set the UnitName
     */
    public void setUnitName(String value) {
        setAttributeInternal(UNITNAME, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getXxOdmIssueToStitchLTEO() {
        return (RowIterator)getAttributeInternal(XXODMISSUETOSTITCHLTEO);
    }


    /**
     * @param headerId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Number headerId) {
        return new Key(new Object[]{headerId});
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        String v="1";
        super.create(attributeList);
        oracle.jbo.server.SequenceImpl s =new oracle.jbo.server.SequenceImpl("XX_ODM_ISSUE_TO_STITCH_H_S",getDBTransaction());
        oracle.jbo.domain.Number sVal = s.getSequenceNumber();
        setHeaderId(sVal);
        setFlag(v);
       
        
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
//    public void lock() {
//        super.lock();
//    }

     /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
     protected void doDML(int operation, TransactionEvent e) {

    
    Map sessionScope    = ADFContext.getCurrent().getSessionScope();
    String user         = (String)sessionScope.get("userId");
    String orgId        = (String)sessionScope.get("orgId");
    String unitName     = (String)sessionScope.get("unitName");


    if (operation == DML_INSERT) {


        try {
            setChallanNo(String.valueOf(getSrNoString())); 
            //setChallanNo(new oracle.jbo.domain.Number(getMasterChallanNoSer()));
            setUnit(new oracle.jbo.domain.Number(orgId));
          //  setUnitName(unitName);
            setCreationDate((Date)Date.getCurrentDate());
           setCreationBy(new oracle.jbo.domain.Number(user));


        } catch (SQLException f) {
            ;
        }
    } else if (DML_UPDATE == operation) {
        try {
            setUpdateDate((Date)Date.getCurrentDate());
            setUpdateBy(new oracle.jbo.domain.Number(user));
        } catch (SQLException f) {
            ;
        }
    }

    super.doDML(operation, e);
    }
    
    public String getSrNoString() {
      System.out.println("i am in challen no function");
        String srno = null;
        String stmt = "BEGIN :1 :=mnj_mfg_doc_no_pkg.mnj_issue_recv_doc_no_washing; end;";
        java.sql.CallableStatement cs =
            getDBTransaction().createCallableStatement(stmt, 1);
        try {
            cs.registerOutParameter(1, oracle.jdbc.OracleTypes.VARCHAR);
            cs.execute();
            srno = cs.getString(1);
            cs.close();
            System.out.println("success:"+srno);
            System.out.println(srno+"srno--->"+srno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return srno;
    }
    
    public int getMasterChallanNoSer() {


        int result = 0;
        String stmt = "BEGIN :1 := MNJ_MASTER_CHALLAN_NO_F(); end;";

        CallableStatement cs =
            getDBTransaction().createCallableStatement(stmt, 1);
        try {
            cs.registerOutParameter(1, OracleTypes.VARCHAR);
            cs.execute();
            result = cs.getInt(1);
            cs.close();

        } catch (Exception e) {
            result = 0;
        }
        return result;

    }
}
