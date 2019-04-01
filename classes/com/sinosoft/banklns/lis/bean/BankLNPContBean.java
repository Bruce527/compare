/*    */ package com.sinosoft.banklns.lis.bean;
/*    */ 
/*    */ import com.sinosoft.banklns.lis.schema.LNPContSchema;
/*    */ 
/*    */ public class BankLNPContBean extends BankBeanBasic
/*    */ {
/*  7 */   private LNPContSchema schema = new LNPContSchema();
/*    */ 
/*    */   public LNPContSchema getSchema() {
/* 10 */     return this.schema;
/*    */   }
/*    */ 
/*    */   public void setSchema(LNPContSchema schema) {
/* 14 */     this.schema = schema;
/*    */   }
/*    */ }

/* Location:           C:\Kevin_File\Java\workspace\MDES\WebContent\WEB-INF\classes\
 * Qualified Name:     com.sinosoft.banklns.lis.bean.BankLNPContBean
 * JD-Core Version:    0.6.0
 */