/*    */ package com.sinosoft.map.lis.vschema;
/*    */ 
/*    */ import com.sinosoft.map.lis.schema.MNewClientSchema;
/*    */ import com.sinosoft.map.utility.CErrors;
/*    */ import com.sinosoft.map.utility.SchemaSet;
/*    */ 
/*    */ public class MNewClientSet extends SchemaSet
/*    */ {
/*    */   public boolean add(MNewClientSchema aSchema)
/*    */   {
/* 17 */     return super.add(aSchema);
/*    */   }
/*    */ 
/*    */   public boolean add(MNewClientSet aSet)
/*    */   {
/* 22 */     return super.add(aSet);
/*    */   }
/*    */ 
/*    */   public boolean remove(MNewClientSchema aSchema)
/*    */   {
/* 27 */     return super.remove(aSchema);
/*    */   }
/*    */ 
/*    */   public MNewClientSchema get(int index)
/*    */   {
/* 32 */     MNewClientSchema tSchema = (MNewClientSchema)super.getObj(index);
/* 33 */     return tSchema;
/*    */   }
/*    */ 
/*    */   public boolean set(int index, MNewClientSchema aSchema)
/*    */   {
/* 38 */     return super.set(index, aSchema);
/*    */   }
/*    */ 
/*    */   public boolean set(MNewClientSet aSet)
/*    */   {
/* 43 */     return super.set(aSet);
/*    */   }
/*    */ 
/*    */   public String encode()
/*    */   {
/* 49 */     StringBuffer strReturn = new StringBuffer("");
/* 50 */     int n = size();
/* 51 */     for (int i = 1; i <= n; i++)
/*    */     {
/* 53 */       MNewClientSchema aSchema = get(i);
/* 54 */       strReturn.append(aSchema.encode());
/* 55 */       if (i == n) continue; strReturn.append("^");
/*    */     }
/*    */ 
/* 58 */     return strReturn.toString();
/*    */   }
/*    */ 
/*    */   public boolean decode(String str)
/*    */   {
/* 64 */     int nBeginPos = 0;
/* 65 */     int nEndPos = str.indexOf('^');
/* 66 */     clear();
/*    */ 
/* 68 */     while (nEndPos != -1)
/*    */     {
/* 70 */       MNewClientSchema aSchema = new MNewClientSchema();
/* 71 */       if (aSchema.decode(str.substring(nBeginPos, nEndPos)))
/*    */       {
/* 73 */         add(aSchema);
/* 74 */         nBeginPos = nEndPos + 1;
/* 75 */         nEndPos = str.indexOf('^', nEndPos + 1);
/*    */       }
/*    */       else
/*    */       {
/* 80 */         this.mErrors.copyAllErrors(aSchema.mErrors);
/* 81 */         return false;
/*    */       }
/*    */     }
/* 84 */     MNewClientSchema tSchema = new MNewClientSchema();
/* 85 */     if (tSchema.decode(str.substring(nBeginPos)))
/*    */     {
/* 87 */       add(tSchema);
/* 88 */       return true;
/*    */     }
/*    */ 
/* 93 */     this.mErrors.copyAllErrors(tSchema.mErrors);
/* 94 */     return false;
/*    */   }
/*    */ }

/* Location:           C:\Kevin_File\Java\workspace\MDES\WebContent\WEB-INF\classes\
 * Qualified Name:     com.sinosoft.map.lis.vschema.MNewClientSet
 * JD-Core Version:    0.6.0
 */