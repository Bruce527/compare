/*    */ package com.sinosoft.banklns.lis.bean;
/*    */ 
/*    */ import com.sinosoft.banklns.lis.schema.CRSInfoSchema;
/*    */ 
/*    */ public class CRSInfoBean extends BankBeanBasic
/*    */ {
/*  6 */   private CRSInfoSchema schema = new CRSInfoSchema();
/*    */ 
/*    */   public CRSInfoSchema getSchema() {
/*  9 */     return this.schema;
/*    */   }
/*    */ 
/*    */   public void setSchema(CRSInfoSchema schema) {
/* 13 */     this.schema = schema;
/*    */   }
/*    */ }

/* Location:           C:\Kevin_File\Java\workspace\MDES\WebContent\WEB-INF\classes\
 * Qualified Name:     com.sinosoft.banklns.lis.bean.CRSInfoBean
 * JD-Core Version:    0.6.0
 */