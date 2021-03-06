/*     */ package com.sinosoft.banklns.lis.db;
/*     */ 
/*     */ import com.sinosoft.banklns.lis.schema.LNPPolBSchema;
/*     */ import com.sinosoft.banklns.lis.vschema.LNPPolBSet;
/*     */ import com.sinosoft.banklns.utility.CError;
/*     */ import com.sinosoft.banklns.utility.CErrors;
/*     */ import com.sinosoft.banklns.utility.DBConnPool;
/*     */ import com.sinosoft.banklns.utility.DBOper;
/*     */ import com.sinosoft.banklns.utility.SQLString;
/*     */ import com.sinosoft.banklns.utility.StrTool;
/*     */ import java.sql.Connection;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.Statement;
/*     */ 
/*     */ public class LNPPolBDB extends LNPPolBSchema
/*     */ {
/*     */   private Connection con;
/*     */   private DBOper db;
/*  23 */   private boolean mflag = false;
/*     */ 
/*  25 */   public CErrors mErrors = new CErrors();
/*     */ 
/*     */   public LNPPolBDB(Connection tConnection)
/*     */   {
/*  30 */     this.con = tConnection;
/*  31 */     this.db = new DBOper(this.con, "LNPPolB");
/*  32 */     this.mflag = true;
/*     */   }
/*     */ 
/*     */   public LNPPolBDB()
/*     */   {
/*  37 */     this.con = null;
/*  38 */     this.db = new DBOper("LNPPolB");
/*  39 */     this.mflag = false;
/*     */   }
/*     */ 
/*     */   public boolean insert()
/*     */   {
/*  45 */     LNPPolBSchema tSchema = getSchema();
/*  46 */     if (!this.db.insert(tSchema))
/*     */     {
/*  49 */       this.mErrors.copyAllErrors(this.db.mErrors);
/*  50 */       CError tError = new CError();
/*  51 */       tError.moduleName = "LNPPolBDB";
/*  52 */       tError.functionName = "insert";
/*  53 */       tError.errorMessage = "\u951F\u65A4\u62F7\u951F\u65A4\u62F7\u5931\u951F\u65A4\u62F7!";
/*  54 */       this.mErrors.addOneError(tError);
/*     */ 
/*  56 */       return false;
/*     */     }
/*     */ 
/*  59 */     return true;
/*     */   }
/*     */ 
/*     */   public boolean update()
/*     */   {
/*  64 */     LNPPolBSchema tSchema = getSchema();
/*  65 */     if (!this.db.update(tSchema))
/*     */     {
/*  68 */       this.mErrors.copyAllErrors(this.db.mErrors);
/*  69 */       CError tError = new CError();
/*  70 */       tError.moduleName = "LNPPolBDB";
/*  71 */       tError.functionName = "update";
/*  72 */       tError.errorMessage = "\u951F\u65A4\u62F7\u951F\u65A4\u62F7\u5931\u951F\u65A4\u62F7!";
/*  73 */       this.mErrors.addOneError(tError);
/*     */ 
/*  75 */       return false;
/*     */     }
/*     */ 
/*  78 */     return true;
/*     */   }
/*     */ 
/*     */   public boolean deleteSQL()
/*     */   {
/*  83 */     LNPPolBSchema tSchema = getSchema();
/*  84 */     if (!this.db.deleteSQL(tSchema))
/*     */     {
/*  87 */       this.mErrors.copyAllErrors(this.db.mErrors);
/*  88 */       CError tError = new CError();
/*  89 */       tError.moduleName = "LNPPolBDB";
/*  90 */       tError.functionName = "deleteSQL";
/*  91 */       tError.errorMessage = "\u951F\u65A4\u62F7\u951F\u65A4\u62F7\u5931\u951F\u65A4\u62F7!";
/*  92 */       this.mErrors.addOneError(tError);
/*     */ 
/*  94 */       return false;
/*     */     }
/*     */ 
/*  97 */     return true;
/*     */   }
/*     */ 
/*     */   public boolean delete()
/*     */   {
/* 102 */     LNPPolBSchema tSchema = getSchema();
/* 103 */     if (!this.db.delete(tSchema))
/*     */     {
/* 106 */       this.mErrors.copyAllErrors(this.db.mErrors);
/* 107 */       CError tError = new CError();
/* 108 */       tError.moduleName = "LNPPolBDB";
/* 109 */       tError.functionName = "delete";
/* 110 */       tError.errorMessage = "\u951F\u65A4\u62F7\u951F\u65A4\u62F7\u5931\u951F\u65A4\u62F7!";
/* 111 */       this.mErrors.addOneError(tError);
/*     */ 
/* 113 */       return false;
/*     */     }
/*     */ 
/* 116 */     return true;
/*     */   }
/*     */ 
/*     */   public int getCount()
/*     */   {
/* 121 */     LNPPolBSchema tSchema = getSchema();
/*     */ 
/* 123 */     int tCount = this.db.getCount(tSchema);
/* 124 */     if (tCount < 0)
/*     */     {
/* 127 */       this.mErrors.copyAllErrors(this.db.mErrors);
/* 128 */       CError tError = new CError();
/* 129 */       tError.moduleName = "LNPPolBDB";
/* 130 */       tError.functionName = "getCount";
/* 131 */       tError.errorMessage = "\u951F\u65A4\u62F7\u951F\u65A4\u62F7\u5931\u951F\u65A4\u62F7!";
/* 132 */       this.mErrors.addOneError(tError);
/*     */ 
/* 134 */       return -1;
/*     */     }
/*     */ 
/* 137 */     return tCount;
/*     */   }
/*     */ 
/*     */   public boolean getInfo()
/*     */   {
/* 142 */     Statement stmt = null;
/* 143 */     ResultSet rs = null;
/*     */ 
/* 145 */     if (!this.mflag) {
/* 146 */       this.con = DBConnPool.getConnection();
/*     */     }
/*     */ 
/*     */     try
/*     */     {
/* 151 */       stmt = this.con.createStatement(1003, 1007);
/* 152 */       SQLString sqlObj = new SQLString("LNPPolB");
/* 153 */       LNPPolBSchema aSchema = getSchema();
/* 154 */       sqlObj.setSQL(6, aSchema);
/* 155 */       String sql = sqlObj.getSQL();
/*     */ 
/* 157 */       rs = stmt.executeQuery(sql);
/* 158 */       int i = 0;
/* 159 */       if (rs.next())
/*     */       {
/* 161 */         i++;
/* 162 */         if (!setSchema(rs, i))
/*     */         {
/* 165 */           CError tError = new CError();
/* 166 */           tError.moduleName = "LNPPolBDB";
/* 167 */           tError.functionName = "getInfo";
/* 168 */           tError.errorMessage = "\u53D6\u951F\u65A4\u62F7\u5931\u951F\u65A4\u62F7!";
/* 169 */           this.mErrors.addOneError(tError);
/*     */           try {
/* 171 */             rs.close(); } catch (Exception localException1) {
/*     */           }try { stmt.close(); } catch (Exception localException2) {
/*     */           }
/* 174 */           if (!this.mflag)
/*     */           {
/*     */             try
/*     */             {
/* 178 */               this.con.close();
/*     */             } catch (Exception localException3) {
/*     */             }
/*     */           }
/* 182 */           return false;
/*     */         }
/*     */       }
/*     */       try {
/* 186 */         rs.close(); } catch (Exception localException4) {
/*     */       }try { stmt.close(); } catch (Exception localException5) {
/*     */       }
/* 189 */       if (i == 0)
/*     */       {
/* 192 */         CError tError = new CError();
/* 193 */         tError.moduleName = "LNPPolBDB";
/* 194 */         tError.functionName = "getInfo";
/* 195 */         tError.errorMessage = "\u672A\u951F\u63ED\u7889\u62F7\u951F\u65A4\u62F7\u951F\u65A4\u62F7\u951F\u65A4\u62F7!";
/* 196 */         this.mErrors.addOneError(tError);
/*     */ 
/* 198 */         if (!this.mflag)
/*     */         {
/*     */           try
/*     */           {
/* 202 */             this.con.close();
/*     */           } catch (Exception localException6) {
/*     */           }
/*     */         }
/* 206 */         return false;
/*     */       }
/*     */ 
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/* 212 */       CError tError = new CError();
/* 213 */       tError.moduleName = "LNPPolBDB";
/* 214 */       tError.functionName = "getInfo";
/* 215 */       tError.errorMessage = e.toString();
/* 216 */       this.mErrors.addOneError(tError);
/*     */       try {
/* 218 */         rs.close(); } catch (Exception localException7) {
/*     */       }try { stmt.close(); } catch (Exception localException8) {
/*     */       }
/* 221 */       if (!this.mflag)
/*     */       {
/*     */         try
/*     */         {
/* 225 */           this.con.close();
/*     */         } catch (Exception localException9) {
/*     */         }
/*     */       }
/* 229 */       return false;
/*     */     }
/*     */ 
/* 232 */     if (!this.mflag)
/*     */     {
/*     */       try
/*     */       {
/* 236 */         this.con.close();
/*     */       }
/*     */       catch (Exception localException10) {
/*     */       }
/*     */     }
/* 241 */     return true;
/*     */   }
/*     */ 
/*     */   public LNPPolBSet query()
/*     */   {
/* 246 */     Statement stmt = null;
/* 247 */     ResultSet rs = null;
/* 248 */     LNPPolBSet aLNPPolBSet = new LNPPolBSet();
/*     */ 
/* 250 */     if (!this.mflag) {
/* 251 */       this.con = DBConnPool.getConnection();
/*     */     }
/*     */ 
/*     */     try
/*     */     {
/* 256 */       stmt = this.con.createStatement(1003, 1007);
/* 257 */       SQLString sqlObj = new SQLString("LNPPolB");
/* 258 */       LNPPolBSchema aSchema = getSchema();
/* 259 */       sqlObj.setSQL(5, aSchema);
/* 260 */       String sql = sqlObj.getSQL();
/*     */ 
/* 262 */       rs = stmt.executeQuery(sql);
/* 263 */       int i = 0;
/* 264 */       while (rs.next())
/*     */       {
/* 266 */         i++;
/* 267 */         LNPPolBSchema s1 = new LNPPolBSchema();
/* 268 */         s1.setSchema(rs, i);
/* 269 */         aLNPPolBSet.add(s1);
/*     */       }try {
/* 271 */         rs.close(); } catch (Exception localException1) {
/*     */       }try { stmt.close();
/*     */       } catch (Exception localException2) {
/*     */       }
/*     */     }
/*     */     catch (Exception e) {
/* 277 */       CError tError = new CError();
/* 278 */       tError.moduleName = "LNPPolBDB";
/* 279 */       tError.functionName = "query";
/* 280 */       tError.errorMessage = e.toString();
/* 281 */       this.mErrors.addOneError(tError);
/*     */       try {
/* 283 */         rs.close(); } catch (Exception localException3) {
/*     */       }try { stmt.close(); } catch (Exception localException4) {
/*     */       }
/* 286 */       if (!this.mflag)
/*     */       {
/*     */         try
/*     */         {
/* 290 */           this.con.close();
/*     */         }
/*     */         catch (Exception localException5) {
/*     */         }
/*     */       }
/*     */     }
/* 296 */     if (!this.mflag)
/*     */     {
/*     */       try
/*     */       {
/* 300 */         this.con.close();
/*     */       }
/*     */       catch (Exception localException6) {
/*     */       }
/*     */     }
/* 305 */     return aLNPPolBSet;
/*     */   }
/*     */ 
/*     */   public LNPPolBSet executeQuery(String sql)
/*     */   {
/* 310 */     Statement stmt = null;
/* 311 */     ResultSet rs = null;
/* 312 */     LNPPolBSet aLNPPolBSet = new LNPPolBSet();
/*     */ 
/* 314 */     if (!this.mflag) {
/* 315 */       this.con = DBConnPool.getConnection();
/*     */     }
/*     */ 
/*     */     try
/*     */     {
/* 320 */       stmt = this.con.createStatement(1003, 1007);
/*     */ 
/* 322 */       rs = stmt.executeQuery(StrTool.GBKToUnicode(sql));
/* 323 */       int i = 0;
/* 324 */       while (rs.next())
/*     */       {
/* 326 */         i++;
/* 327 */         LNPPolBSchema s1 = new LNPPolBSchema();
/* 328 */         if (!s1.setSchema(rs, i))
/*     */         {
/* 331 */           CError tError = new CError();
/* 332 */           tError.moduleName = "LNPPolBDB";
/* 333 */           tError.functionName = "executeQuery";
/* 334 */           tError.errorMessage = "sql\u951F\u65A4\u62F7\u951F\u65A4\u62F7\u951F\u65A4\u62F7\u951F\u65A4\u62F7\u951F\u4ECB\u770B\u951F\u65A4\u62F7\u951F\u65A4\u62F7\u951F\u8857\u8BB9\u62F7\u951F\u65A4\u62F7\u951F\u65A4\u62F7\u606F!";
/* 335 */           this.mErrors.addOneError(tError);
/*     */         }
/* 337 */         aLNPPolBSet.add(s1);
/*     */       }try {
/* 339 */         rs.close(); } catch (Exception localException1) {
/*     */       }try { stmt.close();
/*     */       } catch (Exception localException2) {
/*     */       }
/*     */     }
/*     */     catch (Exception e) {
/* 345 */       CError tError = new CError();
/* 346 */       tError.moduleName = "LNPPolBDB";
/* 347 */       tError.functionName = "executeQuery";
/* 348 */       tError.errorMessage = e.toString();
/* 349 */       this.mErrors.addOneError(tError);
/*     */       try {
/* 351 */         rs.close(); } catch (Exception localException3) {
/*     */       }try { stmt.close(); } catch (Exception localException4) {
/*     */       }
/* 354 */       if (!this.mflag)
/*     */       {
/*     */         try
/*     */         {
/* 358 */           this.con.close();
/*     */         }
/*     */         catch (Exception localException5) {
/*     */         }
/*     */       }
/*     */     }
/* 364 */     if (!this.mflag)
/*     */     {
/*     */       try
/*     */       {
/* 368 */         this.con.close();
/*     */       }
/*     */       catch (Exception localException6) {
/*     */       }
/*     */     }
/* 373 */     return aLNPPolBSet;
/*     */   }
/*     */ 
/*     */   public LNPPolBSet query(int nStart, int nCount)
/*     */   {
/* 378 */     Statement stmt = null;
/* 379 */     ResultSet rs = null;
/* 380 */     LNPPolBSet aLNPPolBSet = new LNPPolBSet();
/*     */ 
/* 382 */     if (!this.mflag) {
/* 383 */       this.con = DBConnPool.getConnection();
/*     */     }
/*     */ 
/*     */     try
/*     */     {
/* 388 */       stmt = this.con.createStatement(1003, 1007);
/* 389 */       SQLString sqlObj = new SQLString("LNPPolB");
/* 390 */       LNPPolBSchema aSchema = getSchema();
/* 391 */       sqlObj.setSQL(5, aSchema);
/* 392 */       String sql = sqlObj.getSQL();
/*     */ 
/* 394 */       rs = stmt.executeQuery(sql);
/* 395 */       int i = 0;
/* 396 */       while (rs.next())
/*     */       {
/* 398 */         i++;
/*     */ 
/* 400 */         if (i < nStart)
/*     */         {
/*     */           continue;
/*     */         }
/* 404 */         if (i >= nStart + nCount)
/*     */         {
/*     */           break;
/*     */         }
/* 408 */         LNPPolBSchema s1 = new LNPPolBSchema();
/* 409 */         s1.setSchema(rs, i);
/* 410 */         aLNPPolBSet.add(s1);
/*     */       }try {
/* 412 */         rs.close(); } catch (Exception localException1) {
/*     */       }try { stmt.close();
/*     */       } catch (Exception localException2) {
/*     */       }
/*     */     }
/*     */     catch (Exception e) {
/* 418 */       CError tError = new CError();
/* 419 */       tError.moduleName = "LNPPolBDB";
/* 420 */       tError.functionName = "query";
/* 421 */       tError.errorMessage = e.toString();
/* 422 */       this.mErrors.addOneError(tError);
/*     */       try {
/* 424 */         rs.close(); } catch (Exception localException3) {
/*     */       }try { stmt.close(); } catch (Exception localException4) {
/*     */       }
/* 427 */       if (!this.mflag)
/*     */       {
/*     */         try
/*     */         {
/* 431 */           this.con.close();
/*     */         }
/*     */         catch (Exception localException5) {
/*     */         }
/*     */       }
/*     */     }
/* 437 */     if (!this.mflag)
/*     */     {
/*     */       try
/*     */       {
/* 441 */         this.con.close();
/*     */       }
/*     */       catch (Exception localException6) {
/*     */       }
/*     */     }
/* 446 */     return aLNPPolBSet;
/*     */   }
/*     */ 
/*     */   public LNPPolBSet executeQuery(String sql, int nStart, int nCount)
/*     */   {
/* 451 */     Statement stmt = null;
/* 452 */     ResultSet rs = null;
/* 453 */     LNPPolBSet aLNPPolBSet = new LNPPolBSet();
/*     */ 
/* 455 */     if (!this.mflag) {
/* 456 */       this.con = DBConnPool.getConnection();
/*     */     }
/*     */ 
/*     */     try
/*     */     {
/* 461 */       stmt = this.con.createStatement(1003, 1007);
/*     */ 
/* 463 */       rs = stmt.executeQuery(StrTool.GBKToUnicode(sql));
/* 464 */       int i = 0;
/* 465 */       while (rs.next())
/*     */       {
/* 467 */         i++;
/*     */ 
/* 469 */         if (i < nStart)
/*     */         {
/*     */           continue;
/*     */         }
/* 473 */         if (i >= nStart + nCount)
/*     */         {
/*     */           break;
/*     */         }
/* 477 */         LNPPolBSchema s1 = new LNPPolBSchema();
/* 478 */         if (!s1.setSchema(rs, i))
/*     */         {
/* 481 */           CError tError = new CError();
/* 482 */           tError.moduleName = "LNPPolBDB";
/* 483 */           tError.functionName = "executeQuery";
/* 484 */           tError.errorMessage = "sql\u951F\u65A4\u62F7\u951F\u65A4\u62F7\u951F\u65A4\u62F7\u951F\u65A4\u62F7\u951F\u4ECB\u770B\u951F\u65A4\u62F7\u951F\u65A4\u62F7\u951F\u8857\u8BB9\u62F7\u951F\u65A4\u62F7\u951F\u65A4\u62F7\u606F!";
/* 485 */           this.mErrors.addOneError(tError);
/*     */         }
/* 487 */         aLNPPolBSet.add(s1);
/*     */       }try {
/* 489 */         rs.close(); } catch (Exception localException1) {
/*     */       }try { stmt.close();
/*     */       } catch (Exception localException2) {
/*     */       }
/*     */     }
/*     */     catch (Exception e) {
/* 495 */       CError tError = new CError();
/* 496 */       tError.moduleName = "LNPPolBDB";
/* 497 */       tError.functionName = "executeQuery";
/* 498 */       tError.errorMessage = e.toString();
/* 499 */       this.mErrors.addOneError(tError);
/*     */       try {
/* 501 */         rs.close(); } catch (Exception localException3) {
/*     */       }try { stmt.close(); } catch (Exception localException4) {
/*     */       }
/* 504 */       if (!this.mflag)
/*     */       {
/*     */         try
/*     */         {
/* 508 */           this.con.close();
/*     */         }
/*     */         catch (Exception localException5) {
/*     */         }
/*     */       }
/*     */     }
/* 514 */     if (!this.mflag)
/*     */     {
/*     */       try
/*     */       {
/* 518 */         this.con.close();
/*     */       }
/*     */       catch (Exception localException6) {
/*     */       }
/*     */     }
/* 523 */     return aLNPPolBSet;
/*     */   }
/*     */ 
/*     */   public boolean update(String strWherePart)
/*     */   {
/* 528 */     Statement stmt = null;
/*     */ 
/* 530 */     if (!this.mflag) {
/* 531 */       this.con = DBConnPool.getConnection();
/*     */     }
/*     */ 
/*     */     try
/*     */     {
/* 536 */       stmt = this.con.createStatement(1003, 1007);
/* 537 */       SQLString sqlObj = new SQLString("LNPPolB");
/* 538 */       LNPPolBSchema aSchema = getSchema();
/* 539 */       sqlObj.setSQL(2, aSchema);
/* 540 */       String sql = "update LNPPolB " + sqlObj.getUpdPart() + " where " + strWherePart;
/*     */ 
/* 542 */       int operCount = stmt.executeUpdate(sql);
/* 543 */       if (operCount == 0)
/*     */       {
/* 546 */         CError tError = new CError();
/* 547 */         tError.moduleName = "LNPPolBDB";
/* 548 */         tError.functionName = "update";
/* 549 */         tError.errorMessage = "\u951F\u65A4\u62F7\u951F\u65A4\u62F7\u951F\u65A4\u62F7\u951F\u7EDE\u044D\u62F7\u951F\uFFFD!";
/* 550 */         this.mErrors.addOneError(tError);
/*     */ 
/* 552 */         if (!this.mflag)
/*     */         {
/*     */           try
/*     */           {
/* 556 */             this.con.close();
/*     */           } catch (Exception localException1) {
/*     */           }
/*     */         }
/* 560 */         return false;
/*     */       }
/*     */ 
/*     */     }
/*     */     catch (Exception e)
/*     */     {
/* 566 */       CError tError = new CError();
/* 567 */       tError.moduleName = "LNPPolBDB";
/* 568 */       tError.functionName = "update";
/* 569 */       tError.errorMessage = e.toString();
/* 570 */       this.mErrors.addOneError(tError);
/*     */       try {
/* 572 */         stmt.close(); } catch (Exception localException2) {
/*     */       }
/* 574 */       if (!this.mflag)
/*     */       {
/*     */         try
/*     */         {
/* 578 */           this.con.close();
/*     */         } catch (Exception localException3) {
/*     */         }
/*     */       }
/* 582 */       return false;
/*     */     }
/*     */ 
/* 585 */     if (!this.mflag)
/*     */     {
/*     */       try
/*     */       {
/* 589 */         this.con.close();
/*     */       }
/*     */       catch (Exception localException4) {
/*     */       }
/*     */     }
/* 594 */     return true;
/*     */   }
/*     */ }

/* Location:           C:\Kevin_File\Java\workspace\MDES\WebContent\WEB-INF\classes\
 * Qualified Name:     com.sinosoft.banklns.lis.db.LNPPolBDB
 * JD-Core Version:    0.6.0
 */