/*     */ package com.sinosoft.map.lis.schema;
/*     */ 
/*     */ import com.sinosoft.map.lis.db.MUserLoginLogDB;
/*     */ import com.sinosoft.map.lis.pubfun.FDate;
/*     */ import com.sinosoft.map.utility.CError;
/*     */ import com.sinosoft.map.utility.CErrors;
/*     */ import com.sinosoft.map.utility.Schema;
/*     */ import com.sinosoft.map.utility.StrTool;
/*     */ import java.io.PrintStream;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import java.util.Date;
/*     */ 
/*     */ public class MUserLoginLogSchema
/*     */   implements Schema, Cloneable
/*     */ {
/*     */   private String iD;
/*     */   private String userCode;
/*     */   private String userType;
/*     */   private String clientName;
/*     */   private String clientType;
/*     */   private String clientIP;
/*     */   private Date loginDate;
/*     */   private String loginTime;
/*     */   private Date logoutDate;
/*     */   private String logoutTime;
/*     */   public static final int FIELDNUM = 10;
/*     */   private static String[] PK;
/*  44 */   private FDate fDate = new FDate();
/*     */   public CErrors mErrors;
/*     */ 
/*     */   public MUserLoginLogSchema()
/*     */   {
/*  51 */     this.mErrors = new CErrors();
/*     */ 
/*  53 */     String[] pk = new String[1];
/*  54 */     pk[0] = "ID";
/*     */ 
/*  56 */     PK = pk;
/*     */   }
/*     */ 
/*     */   public Object clone()
/*     */     throws CloneNotSupportedException
/*     */   {
/*  63 */     MUserLoginLogSchema cloned = (MUserLoginLogSchema)super.clone();
/*  64 */     cloned.fDate = ((FDate)this.fDate.clone());
/*  65 */     cloned.mErrors = ((CErrors)this.mErrors.clone());
/*  66 */     return cloned;
/*     */   }
/*     */ 
/*     */   public String[] getPK()
/*     */   {
/*  72 */     return PK;
/*     */   }
/*     */ 
/*     */   public String getID()
/*     */   {
/*  77 */     return this.iD;
/*     */   }
/*     */ 
/*     */   public void setID(String aID) {
/*  81 */     this.iD = aID;
/*     */   }
/*     */ 
/*     */   public String getUserCode() {
/*  85 */     return this.userCode;
/*     */   }
/*     */ 
/*     */   public void setUserCode(String aUserCode) {
/*  89 */     this.userCode = aUserCode;
/*     */   }
/*     */ 
/*     */   public String getUserType() {
/*  93 */     return this.userType;
/*     */   }
/*     */ 
/*     */   public void setUserType(String aUserType) {
/*  97 */     this.userType = aUserType;
/*     */   }
/*     */ 
/*     */   public String getClientName() {
/* 101 */     return this.clientName;
/*     */   }
/*     */ 
/*     */   public void setClientName(String aClientName) {
/* 105 */     this.clientName = aClientName;
/*     */   }
/*     */ 
/*     */   public String getClientType() {
/* 109 */     return this.clientType;
/*     */   }
/*     */ 
/*     */   public void setClientType(String aClientType) {
/* 113 */     this.clientType = aClientType;
/*     */   }
/*     */ 
/*     */   public String getClientIP() {
/* 117 */     return this.clientIP;
/*     */   }
/*     */ 
/*     */   public void setClientIP(String aClientIP) {
/* 121 */     this.clientIP = aClientIP;
/*     */   }
/*     */ 
/*     */   public String getLoginDate() {
/* 125 */     if (this.loginDate != null) {
/* 126 */       return this.fDate.getString(this.loginDate);
/*     */     }
/* 128 */     return null;
/*     */   }
/*     */ 
/*     */   public void setLoginDate(Date aLoginDate) {
/* 132 */     this.loginDate = aLoginDate;
/*     */   }
/*     */ 
/*     */   public void setLoginDate(String aLoginDate) {
/* 136 */     if ((aLoginDate != null) && (!aLoginDate.equals("")))
/*     */     {
/* 138 */       this.loginDate = this.fDate.getDate(aLoginDate);
/*     */     }
/*     */     else
/* 141 */       this.loginDate = null;
/*     */   }
/*     */ 
/*     */   public String getLoginTime()
/*     */   {
/* 146 */     return this.loginTime;
/*     */   }
/*     */ 
/*     */   public void setLoginTime(String aLoginTime) {
/* 150 */     this.loginTime = aLoginTime;
/*     */   }
/*     */ 
/*     */   public String getLogoutDate() {
/* 154 */     if (this.logoutDate != null) {
/* 155 */       return this.fDate.getString(this.logoutDate);
/*     */     }
/* 157 */     return null;
/*     */   }
/*     */ 
/*     */   public void setLogoutDate(Date aLogoutDate) {
/* 161 */     this.logoutDate = aLogoutDate;
/*     */   }
/*     */ 
/*     */   public void setLogoutDate(String aLogoutDate) {
/* 165 */     if ((aLogoutDate != null) && (!aLogoutDate.equals("")))
/*     */     {
/* 167 */       this.logoutDate = this.fDate.getDate(aLogoutDate);
/*     */     }
/*     */     else
/* 170 */       this.logoutDate = null;
/*     */   }
/*     */ 
/*     */   public String getLogoutTime()
/*     */   {
/* 175 */     return this.logoutTime;
/*     */   }
/*     */ 
/*     */   public void setLogoutTime(String aLogoutTime) {
/* 179 */     this.logoutTime = aLogoutTime;
/*     */   }
/*     */ 
/*     */   public void setSchema(MUserLoginLogSchema aMUserLoginLogSchema)
/*     */   {
/* 185 */     this.iD = aMUserLoginLogSchema.getID();
/* 186 */     this.userCode = aMUserLoginLogSchema.getUserCode();
/* 187 */     this.userType = aMUserLoginLogSchema.getUserType();
/* 188 */     this.clientName = aMUserLoginLogSchema.getClientName();
/* 189 */     this.clientType = aMUserLoginLogSchema.getClientType();
/* 190 */     this.clientIP = aMUserLoginLogSchema.getClientIP();
/* 191 */     this.loginDate = this.fDate.getDate(aMUserLoginLogSchema.getLoginDate());
/* 192 */     this.loginTime = aMUserLoginLogSchema.getLoginTime();
/* 193 */     this.logoutDate = this.fDate.getDate(aMUserLoginLogSchema.getLogoutDate());
/* 194 */     this.logoutTime = aMUserLoginLogSchema.getLogoutTime();
/*     */   }
/*     */ 
/*     */   public boolean setSchema(ResultSet rs, int i)
/*     */   {
/*     */     try
/*     */     {
/* 203 */       if (rs.getString("ID") == null)
/* 204 */         this.iD = null;
/*     */       else {
/* 206 */         this.iD = rs.getString("ID").trim();
/*     */       }
/* 208 */       if (rs.getString("UserCode") == null)
/* 209 */         this.userCode = null;
/*     */       else {
/* 211 */         this.userCode = rs.getString("UserCode").trim();
/*     */       }
/* 213 */       if (rs.getString("UserType") == null)
/* 214 */         this.userType = null;
/*     */       else {
/* 216 */         this.userType = rs.getString("UserType").trim();
/*     */       }
/* 218 */       if (rs.getString("ClientName") == null)
/* 219 */         this.clientName = null;
/*     */       else {
/* 221 */         this.clientName = rs.getString("ClientName").trim();
/*     */       }
/* 223 */       if (rs.getString("ClientType") == null)
/* 224 */         this.clientType = null;
/*     */       else {
/* 226 */         this.clientType = rs.getString("ClientType").trim();
/*     */       }
/* 228 */       if (rs.getString("ClientIP") == null)
/* 229 */         this.clientIP = null;
/*     */       else {
/* 231 */         this.clientIP = rs.getString("ClientIP").trim();
/*     */       }
/* 233 */       this.loginDate = rs.getDate("LoginDate");
/* 234 */       if (rs.getString("LoginTime") == null)
/* 235 */         this.loginTime = null;
/*     */       else {
/* 237 */         this.loginTime = rs.getString("LoginTime").trim();
/*     */       }
/* 239 */       this.logoutDate = rs.getDate("LogoutDate");
/* 240 */       if (rs.getString("LogoutTime") == null)
/* 241 */         this.logoutTime = null;
/*     */       else {
/* 243 */         this.logoutTime = rs.getString("LogoutTime").trim();
/*     */       }
/*     */     }
/*     */     catch (SQLException sqle)
/*     */     {
/* 248 */       System.out.println("\u6570\u636E\u5E93\u4E2D\u7684MUserLoginLog\u8868\u5B57\u6BB5\u4E2A\u6570\u548CSchema\u4E2D\u7684\u5B57\u6BB5\u4E2A\u6570\u4E0D\u4E00\u81F4\uFF0C\u6216\u8005\u6267\u884Cdb.executeQuery\u67E5\u8BE2\u65F6\u6CA1\u6709\u4F7F\u7528select * from tables");
/*     */ 
/* 250 */       CError tError = new CError();
/* 251 */       tError.moduleName = "MUserLoginLogSchema";
/* 252 */       tError.functionName = "setSchema";
/* 253 */       tError.errorMessage = sqle.toString();
/* 254 */       this.mErrors.addOneError(tError);
/* 255 */       return false;
/*     */     }
/* 257 */     return true;
/*     */   }
/*     */ 
/*     */   public MUserLoginLogSchema getSchema()
/*     */   {
/* 262 */     MUserLoginLogSchema aMUserLoginLogSchema = new MUserLoginLogSchema();
/* 263 */     aMUserLoginLogSchema.setSchema(this);
/* 264 */     return aMUserLoginLogSchema;
/*     */   }
/*     */ 
/*     */   public MUserLoginLogDB getDB()
/*     */   {
/* 269 */     MUserLoginLogDB aDBOper = new MUserLoginLogDB();
/* 270 */     aDBOper.setSchema(this);
/* 271 */     return aDBOper;
/*     */   }
/*     */ 
/*     */   public String encode()
/*     */   {
/* 278 */     StringBuffer strReturn = new StringBuffer(256);
/* 279 */     strReturn.append(StrTool.cTrim(this.iD)); strReturn.append("|");
/* 280 */     strReturn.append(StrTool.cTrim(this.userCode)); strReturn.append("|");
/* 281 */     strReturn.append(StrTool.cTrim(this.userType)); strReturn.append("|");
/* 282 */     strReturn.append(StrTool.cTrim(this.clientName)); strReturn.append("|");
/* 283 */     strReturn.append(StrTool.cTrim(this.clientType)); strReturn.append("|");
/* 284 */     strReturn.append(StrTool.cTrim(this.clientIP)); strReturn.append("|");
/* 285 */     strReturn.append(StrTool.cTrim(this.fDate.getString(this.loginDate))); strReturn.append("|");
/* 286 */     strReturn.append(StrTool.cTrim(this.loginTime)); strReturn.append("|");
/* 287 */     strReturn.append(StrTool.cTrim(this.fDate.getString(this.logoutDate))); strReturn.append("|");
/* 288 */     strReturn.append(StrTool.cTrim(this.logoutTime));
/* 289 */     return strReturn.toString();
/*     */   }
/*     */ 
/*     */   public boolean decode(String strMessage)
/*     */   {
/*     */     try
/*     */     {
/* 297 */       this.iD = StrTool.getStr(StrTool.GBKToUnicode(strMessage), 1, "|");
/* 298 */       this.userCode = StrTool.getStr(StrTool.GBKToUnicode(strMessage), 2, "|");
/* 299 */       this.userType = StrTool.getStr(StrTool.GBKToUnicode(strMessage), 3, "|");
/* 300 */       this.clientName = StrTool.getStr(StrTool.GBKToUnicode(strMessage), 4, "|");
/* 301 */       this.clientType = StrTool.getStr(StrTool.GBKToUnicode(strMessage), 5, "|");
/* 302 */       this.clientIP = StrTool.getStr(StrTool.GBKToUnicode(strMessage), 6, "|");
/* 303 */       this.loginDate = this.fDate.getDate(StrTool.getStr(StrTool.GBKToUnicode(strMessage), 7, "|"));
/* 304 */       this.loginTime = StrTool.getStr(StrTool.GBKToUnicode(strMessage), 8, "|");
/* 305 */       this.logoutDate = this.fDate.getDate(StrTool.getStr(StrTool.GBKToUnicode(strMessage), 9, "|"));
/* 306 */       this.logoutTime = StrTool.getStr(StrTool.GBKToUnicode(strMessage), 10, "|");
/*     */     }
/*     */     catch (NumberFormatException ex)
/*     */     {
/* 311 */       CError tError = new CError();
/* 312 */       tError.moduleName = "MUserLoginLogSchema";
/* 313 */       tError.functionName = "decode";
/* 314 */       tError.errorMessage = ex.toString();
/* 315 */       this.mErrors.addOneError(tError);
/*     */ 
/* 317 */       return false;
/*     */     }
/* 319 */     return true;
/*     */   }
/*     */ 
/*     */   public String getV(String FCode)
/*     */   {
/* 325 */     String strReturn = "";
/* 326 */     if (FCode.equalsIgnoreCase("iD"))
/*     */     {
/* 328 */       strReturn = StrTool.GBKToUnicode(String.valueOf(this.iD));
/*     */     }
/* 330 */     if (FCode.equalsIgnoreCase("userCode"))
/*     */     {
/* 332 */       strReturn = StrTool.GBKToUnicode(String.valueOf(this.userCode));
/*     */     }
/* 334 */     if (FCode.equalsIgnoreCase("userType"))
/*     */     {
/* 336 */       strReturn = StrTool.GBKToUnicode(String.valueOf(this.userType));
/*     */     }
/* 338 */     if (FCode.equalsIgnoreCase("clientName"))
/*     */     {
/* 340 */       strReturn = StrTool.GBKToUnicode(String.valueOf(this.clientName));
/*     */     }
/* 342 */     if (FCode.equalsIgnoreCase("clientType"))
/*     */     {
/* 344 */       strReturn = StrTool.GBKToUnicode(String.valueOf(this.clientType));
/*     */     }
/* 346 */     if (FCode.equalsIgnoreCase("clientIP"))
/*     */     {
/* 348 */       strReturn = StrTool.GBKToUnicode(String.valueOf(this.clientIP));
/*     */     }
/* 350 */     if (FCode.equalsIgnoreCase("loginDate"))
/*     */     {
/* 352 */       strReturn = StrTool.GBKToUnicode(String.valueOf(getLoginDate()));
/*     */     }
/* 354 */     if (FCode.equalsIgnoreCase("loginTime"))
/*     */     {
/* 356 */       strReturn = StrTool.GBKToUnicode(String.valueOf(this.loginTime));
/*     */     }
/* 358 */     if (FCode.equalsIgnoreCase("logoutDate"))
/*     */     {
/* 360 */       strReturn = StrTool.GBKToUnicode(String.valueOf(getLogoutDate()));
/*     */     }
/* 362 */     if (FCode.equalsIgnoreCase("logoutTime"))
/*     */     {
/* 364 */       strReturn = StrTool.GBKToUnicode(String.valueOf(this.logoutTime));
/*     */     }
/* 366 */     if (strReturn.equals(""))
/*     */     {
/* 368 */       strReturn = "null";
/*     */     }
/*     */ 
/* 371 */     return strReturn;
/*     */   }
/*     */ 
/*     */   public String getV(int nFieldIndex)
/*     */   {
/* 378 */     String strFieldValue = "";
/* 379 */     switch (nFieldIndex) {
/*     */     case 0:
/* 381 */       strFieldValue = StrTool.GBKToUnicode(this.iD);
/* 382 */       break;
/*     */     case 1:
/* 384 */       strFieldValue = StrTool.GBKToUnicode(this.userCode);
/* 385 */       break;
/*     */     case 2:
/* 387 */       strFieldValue = StrTool.GBKToUnicode(this.userType);
/* 388 */       break;
/*     */     case 3:
/* 390 */       strFieldValue = StrTool.GBKToUnicode(this.clientName);
/* 391 */       break;
/*     */     case 4:
/* 393 */       strFieldValue = StrTool.GBKToUnicode(this.clientType);
/* 394 */       break;
/*     */     case 5:
/* 396 */       strFieldValue = StrTool.GBKToUnicode(this.clientIP);
/* 397 */       break;
/*     */     case 6:
/* 399 */       strFieldValue = StrTool.GBKToUnicode(String.valueOf(getLoginDate()));
/* 400 */       break;
/*     */     case 7:
/* 402 */       strFieldValue = StrTool.GBKToUnicode(this.loginTime);
/* 403 */       break;
/*     */     case 8:
/* 405 */       strFieldValue = StrTool.GBKToUnicode(String.valueOf(getLogoutDate()));
/* 406 */       break;
/*     */     case 9:
/* 408 */       strFieldValue = StrTool.GBKToUnicode(this.logoutTime);
/* 409 */       break;
/*     */     default:
/* 411 */       strFieldValue = "";
/*     */     }
/* 413 */     if (strFieldValue.equals("")) {
/* 414 */       strFieldValue = "null";
/*     */     }
/* 416 */     return strFieldValue;
/*     */   }
/*     */ 
/*     */   public boolean setV(String FCode, String FValue)
/*     */   {
/* 422 */     if (StrTool.cTrim(FCode).equals("")) {
/* 423 */       return false;
/*     */     }
/* 425 */     if (FCode.equalsIgnoreCase("iD"))
/*     */     {
/* 427 */       if ((FValue != null) && (!FValue.equals("")))
/*     */       {
/* 429 */         this.iD = FValue.trim();
/*     */       }
/*     */       else
/* 432 */         this.iD = null;
/*     */     }
/* 434 */     if (FCode.equalsIgnoreCase("userCode"))
/*     */     {
/* 436 */       if ((FValue != null) && (!FValue.equals("")))
/*     */       {
/* 438 */         this.userCode = FValue.trim();
/*     */       }
/*     */       else
/* 441 */         this.userCode = null;
/*     */     }
/* 443 */     if (FCode.equalsIgnoreCase("userType"))
/*     */     {
/* 445 */       if ((FValue != null) && (!FValue.equals("")))
/*     */       {
/* 447 */         this.userType = FValue.trim();
/*     */       }
/*     */       else
/* 450 */         this.userType = null;
/*     */     }
/* 452 */     if (FCode.equalsIgnoreCase("clientName"))
/*     */     {
/* 454 */       if ((FValue != null) && (!FValue.equals("")))
/*     */       {
/* 456 */         this.clientName = FValue.trim();
/*     */       }
/*     */       else
/* 459 */         this.clientName = null;
/*     */     }
/* 461 */     if (FCode.equalsIgnoreCase("clientType"))
/*     */     {
/* 463 */       if ((FValue != null) && (!FValue.equals("")))
/*     */       {
/* 465 */         this.clientType = FValue.trim();
/*     */       }
/*     */       else
/* 468 */         this.clientType = null;
/*     */     }
/* 470 */     if (FCode.equalsIgnoreCase("clientIP"))
/*     */     {
/* 472 */       if ((FValue != null) && (!FValue.equals("")))
/*     */       {
/* 474 */         this.clientIP = FValue.trim();
/*     */       }
/*     */       else
/* 477 */         this.clientIP = null;
/*     */     }
/* 479 */     if (FCode.equalsIgnoreCase("loginDate"))
/*     */     {
/* 481 */       if ((FValue != null) && (!FValue.equals("")))
/*     */       {
/* 483 */         this.loginDate = this.fDate.getDate(FValue);
/*     */       }
/*     */       else
/* 486 */         this.loginDate = null;
/*     */     }
/* 488 */     if (FCode.equalsIgnoreCase("loginTime"))
/*     */     {
/* 490 */       if ((FValue != null) && (!FValue.equals("")))
/*     */       {
/* 492 */         this.loginTime = FValue.trim();
/*     */       }
/*     */       else
/* 495 */         this.loginTime = null;
/*     */     }
/* 497 */     if (FCode.equalsIgnoreCase("logoutDate"))
/*     */     {
/* 499 */       if ((FValue != null) && (!FValue.equals("")))
/*     */       {
/* 501 */         this.logoutDate = this.fDate.getDate(FValue);
/*     */       }
/*     */       else
/* 504 */         this.logoutDate = null;
/*     */     }
/* 506 */     if (FCode.equalsIgnoreCase("logoutTime"))
/*     */     {
/* 508 */       if ((FValue != null) && (!FValue.equals("")))
/*     */       {
/* 510 */         this.logoutTime = FValue.trim();
/*     */       }
/*     */       else
/* 513 */         this.logoutTime = null;
/*     */     }
/* 515 */     return true;
/*     */   }
/*     */ 
/*     */   public boolean equals(Object otherObject)
/*     */   {
/* 520 */     if (otherObject == null) return false;
/* 521 */     if (this == otherObject) return true;
/* 522 */     if (getClass() != otherObject.getClass()) return false;
/* 523 */     MUserLoginLogSchema other = (MUserLoginLogSchema)otherObject;
/* 524 */     if ((this.iD == null) && (other.getID() != null)) return false;
/* 525 */     if ((this.iD != null) && (!this.iD.equals(other.getID()))) return false;
/* 526 */     if ((this.userCode == null) && (other.getUserCode() != null)) return false;
/* 527 */     if ((this.userCode != null) && (!this.userCode.equals(other.getUserCode()))) return false;
/* 528 */     if ((this.userType == null) && (other.getUserType() != null)) return false;
/* 529 */     if ((this.userType != null) && (!this.userType.equals(other.getUserType()))) return false;
/* 530 */     if ((this.clientName == null) && (other.getClientName() != null)) return false;
/* 531 */     if ((this.clientName != null) && (!this.clientName.equals(other.getClientName()))) return false;
/* 532 */     if ((this.clientType == null) && (other.getClientType() != null)) return false;
/* 533 */     if ((this.clientType != null) && (!this.clientType.equals(other.getClientType()))) return false;
/* 534 */     if ((this.clientIP == null) && (other.getClientIP() != null)) return false;
/* 535 */     if ((this.clientIP != null) && (!this.clientIP.equals(other.getClientIP()))) return false;
/* 536 */     if ((this.loginDate == null) && (other.getLoginDate() != null)) return false;
/* 537 */     if ((this.loginDate != null) && (!this.fDate.getString(this.loginDate).equals(other.getLoginDate()))) return false;
/* 538 */     if ((this.loginTime == null) && (other.getLoginTime() != null)) return false;
/* 539 */     if ((this.loginTime != null) && (!this.loginTime.equals(other.getLoginTime()))) return false;
/* 540 */     if ((this.logoutDate == null) && (other.getLogoutDate() != null)) return false;
/* 541 */     if ((this.logoutDate != null) && (!this.fDate.getString(this.logoutDate).equals(other.getLogoutDate()))) return false;
/* 542 */     if ((this.logoutTime == null) && (other.getLogoutTime() != null)) return false;
/* 543 */     return (this.logoutTime == null) || (this.logoutTime.equals(other.getLogoutTime()));
/*     */   }
/*     */ 
/*     */   public int getFieldCount()
/*     */   {
/* 550 */     return 10;
/*     */   }
/*     */ 
/*     */   public int getFieldIndex(String strFieldName)
/*     */   {
/* 556 */     if (strFieldName.equals("iD")) {
/* 557 */       return 0;
/*     */     }
/* 559 */     if (strFieldName.equals("userCode")) {
/* 560 */       return 1;
/*     */     }
/* 562 */     if (strFieldName.equals("userType")) {
/* 563 */       return 2;
/*     */     }
/* 565 */     if (strFieldName.equals("clientName")) {
/* 566 */       return 3;
/*     */     }
/* 568 */     if (strFieldName.equals("clientType")) {
/* 569 */       return 4;
/*     */     }
/* 571 */     if (strFieldName.equals("clientIP")) {
/* 572 */       return 5;
/*     */     }
/* 574 */     if (strFieldName.equals("loginDate")) {
/* 575 */       return 6;
/*     */     }
/* 577 */     if (strFieldName.equals("loginTime")) {
/* 578 */       return 7;
/*     */     }
/* 580 */     if (strFieldName.equals("logoutDate")) {
/* 581 */       return 8;
/*     */     }
/* 583 */     if (strFieldName.equals("logoutTime")) {
/* 584 */       return 9;
/*     */     }
/* 586 */     return -1;
/*     */   }
/*     */ 
/*     */   public String getFieldName(int nFieldIndex)
/*     */   {
/* 592 */     String strFieldName = "";
/* 593 */     switch (nFieldIndex) {
/*     */     case 0:
/* 595 */       strFieldName = "iD";
/* 596 */       break;
/*     */     case 1:
/* 598 */       strFieldName = "userCode";
/* 599 */       break;
/*     */     case 2:
/* 601 */       strFieldName = "userType";
/* 602 */       break;
/*     */     case 3:
/* 604 */       strFieldName = "clientName";
/* 605 */       break;
/*     */     case 4:
/* 607 */       strFieldName = "clientType";
/* 608 */       break;
/*     */     case 5:
/* 610 */       strFieldName = "clientIP";
/* 611 */       break;
/*     */     case 6:
/* 613 */       strFieldName = "loginDate";
/* 614 */       break;
/*     */     case 7:
/* 616 */       strFieldName = "loginTime";
/* 617 */       break;
/*     */     case 8:
/* 619 */       strFieldName = "logoutDate";
/* 620 */       break;
/*     */     case 9:
/* 622 */       strFieldName = "logoutTime";
/* 623 */       break;
/*     */     default:
/* 625 */       strFieldName = "";
/*     */     }
/* 627 */     return strFieldName;
/*     */   }
/*     */ 
/*     */   public int getFieldType(String strFieldName)
/*     */   {
/* 633 */     if (strFieldName.equals("iD")) {
/* 634 */       return 0;
/*     */     }
/* 636 */     if (strFieldName.equals("userCode")) {
/* 637 */       return 0;
/*     */     }
/* 639 */     if (strFieldName.equals("userType")) {
/* 640 */       return 0;
/*     */     }
/* 642 */     if (strFieldName.equals("clientName")) {
/* 643 */       return 0;
/*     */     }
/* 645 */     if (strFieldName.equals("clientType")) {
/* 646 */       return 0;
/*     */     }
/* 648 */     if (strFieldName.equals("clientIP")) {
/* 649 */       return 0;
/*     */     }
/* 651 */     if (strFieldName.equals("loginDate")) {
/* 652 */       return 1;
/*     */     }
/* 654 */     if (strFieldName.equals("loginTime")) {
/* 655 */       return 0;
/*     */     }
/* 657 */     if (strFieldName.equals("logoutDate")) {
/* 658 */       return 1;
/*     */     }
/* 660 */     if (strFieldName.equals("logoutTime")) {
/* 661 */       return 0;
/*     */     }
/* 663 */     return -1;
/*     */   }
/*     */ 
/*     */   public int getFieldType(int nFieldIndex)
/*     */   {
/* 669 */     int nFieldType = -1;
/* 670 */     switch (nFieldIndex) {
/*     */     case 0:
/* 672 */       nFieldType = 0;
/* 673 */       break;
/*     */     case 1:
/* 675 */       nFieldType = 0;
/* 676 */       break;
/*     */     case 2:
/* 678 */       nFieldType = 0;
/* 679 */       break;
/*     */     case 3:
/* 681 */       nFieldType = 0;
/* 682 */       break;
/*     */     case 4:
/* 684 */       nFieldType = 0;
/* 685 */       break;
/*     */     case 5:
/* 687 */       nFieldType = 0;
/* 688 */       break;
/*     */     case 6:
/* 690 */       nFieldType = 1;
/* 691 */       break;
/*     */     case 7:
/* 693 */       nFieldType = 0;
/* 694 */       break;
/*     */     case 8:
/* 696 */       nFieldType = 1;
/* 697 */       break;
/*     */     case 9:
/* 699 */       nFieldType = 0;
/* 700 */       break;
/*     */     default:
/* 702 */       nFieldType = -1;
/*     */     }
/* 704 */     return nFieldType;
/*     */   }
/*     */ }

/* Location:           C:\Kevin_File\Java\workspace\MDES\WebContent\WEB-INF\classes\
 * Qualified Name:     com.sinosoft.map.lis.schema.MUserLoginLogSchema
 * JD-Core Version:    0.6.0
 */