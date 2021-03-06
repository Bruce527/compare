/*     */ package com.sinosoft.banklns.lnsmodel.webservice.eai;
/*     */ 
/*     */ import com.sinosoft.banklns.lnsmodel.util.EAIPropertiesFromDB;
/*     */ import java.net.URL;
/*     */ import java.rmi.RemoteException;
/*     */ import java.util.Enumeration;
/*     */ import java.util.Properties;
/*     */ import java.util.Vector;
/*     */ import javax.xml.namespace.QName;
/*     */ import org.apache.axis.AxisFault;
/*     */ import org.apache.axis.NoEndPointException;
/*     */ import org.apache.axis.client.Call;
/*     */ import org.apache.axis.client.Stub;
/*     */ import org.apache.axis.constants.Style;
/*     */ import org.apache.axis.constants.Use;
/*     */ import org.apache.axis.description.OperationDesc;
/*     */ import org.apache.axis.description.ParameterDesc;
/*     */ import org.apache.axis.encoding.DeserializerFactory;
/*     */ import org.apache.axis.encoding.ser.ArrayDeserializerFactory;
/*     */ import org.apache.axis.encoding.ser.ArraySerializerFactory;
/*     */ import org.apache.axis.encoding.ser.BeanDeserializerFactory;
/*     */ import org.apache.axis.encoding.ser.BeanSerializerFactory;
/*     */ import org.apache.axis.encoding.ser.EnumDeserializerFactory;
/*     */ import org.apache.axis.encoding.ser.EnumSerializerFactory;
/*     */ import org.apache.axis.encoding.ser.SimpleDeserializerFactory;
/*     */ import org.apache.axis.encoding.ser.SimpleListDeserializerFactory;
/*     */ import org.apache.axis.encoding.ser.SimpleListSerializerFactory;
/*     */ import org.apache.axis.encoding.ser.SimpleSerializerFactory;
/*     */ import org.apache.axis.soap.SOAPConstants;
/*     */ import org.apache.axis.utils.JavaUtils;
/*     */ 
/*     */ public class ESBWebEntrySoap12Stub extends Stub
/*     */   implements ESBWebEntrySoap_PortType
/*     */ {
/*  13 */   private Vector cachedSerClasses = new Vector();
/*  14 */   private Vector cachedSerQNames = new Vector();
/*  15 */   private Vector cachedSerFactories = new Vector();
/*  16 */   private Vector cachedDeserFactories = new Vector();
/*     */ 
/*  21 */   static OperationDesc[] _operations = new OperationDesc[1];
/*     */ 
/*  22 */   static { _initOperationDesc1();
/*     */   }
/*     */ 
/*     */   private static void _initOperationDesc1()
/*     */   {
/*  28 */     OperationDesc oper = new OperationDesc();
/*  29 */     oper.setName("ProcessMessage");
/*  30 */     ParameterDesc param = new ParameterDesc(new QName(EAIPropertiesFromDB.ESBEnvelope_ns, "ESBEnvelope"), 1, new QName(EAIPropertiesFromDB.ESBEnvelope_ns, ">ESBEnvelope"), ESBEnvelope.class, false, false);
/*  31 */     param.setOmittable(true);
/*  32 */     oper.addParameter(param);
/*  33 */     oper.setReturnType(new QName(EAIPropertiesFromDB.ESBEnvelope_ns, ">ESBEnvelopeResult"));
/*  34 */     oper.setReturnClass(ESBEnvelopeResult.class);
/*  35 */     oper.setReturnQName(new QName(EAIPropertiesFromDB.ESBEnvelope_ns, "ESBEnvelopeResult"));
/*  36 */     oper.setStyle(Style.WRAPPED);
/*  37 */     oper.setUse(Use.LITERAL);
/*  38 */     _operations[0] = oper;
/*     */   }
/*     */ 
/*     */   public ESBWebEntrySoap12Stub() throws AxisFault
/*     */   {
/*  43 */     this(null);
/*     */   }
/*     */ 
/*     */   public ESBWebEntrySoap12Stub(URL endpointURL, javax.xml.rpc.Service service) throws AxisFault {
/*  47 */     this(service);
/*  48 */     this.cachedEndpoint = endpointURL;
/*     */   }
/*     */ 
/*     */   public ESBWebEntrySoap12Stub(javax.xml.rpc.Service service) throws AxisFault {
/*  52 */     if (service == null)
/*  53 */       this.service = new org.apache.axis.client.Service();
/*     */     else {
/*  55 */       this.service = service;
/*     */     }
/*  57 */     ((org.apache.axis.client.Service)this.service).setTypeMappingVersion("1.2");
/*     */ 
/*  61 */     Class beansf = BeanSerializerFactory.class;
/*  62 */     Class beandf = BeanDeserializerFactory.class;
/*  63 */     Class enumsf = EnumSerializerFactory.class;
/*  64 */     Class enumdf = EnumDeserializerFactory.class;
/*  65 */     Class arraysf = ArraySerializerFactory.class;
/*  66 */     Class arraydf = ArrayDeserializerFactory.class;
/*  67 */     Class simplesf = SimpleSerializerFactory.class;
/*  68 */     Class simpledf = SimpleDeserializerFactory.class;
/*  69 */     Class simplelistsf = SimpleListSerializerFactory.class;
/*  70 */     Class simplelistdf = SimpleListDeserializerFactory.class;
/*  71 */     QName qName = new QName(EAIPropertiesFromDB.ProcessMessage_ns, ">ProcessMessageResponse");
/*  72 */     this.cachedSerQNames.add(qName);
/*  73 */     Class cls = ProcessMessageResponse.class;
/*  74 */     this.cachedSerClasses.add(cls);
/*  75 */     this.cachedSerFactories.add(beansf);
/*  76 */     this.cachedDeserFactories.add(beandf);
/*     */ 
/*  78 */     qName = new QName(EAIPropertiesFromDB.ESBEnvelope_ns, ">>ESBEnvelope>ESBHeader");
/*  79 */     this.cachedSerQNames.add(qName);
/*  80 */     cls = ESBEnvelopeESBHeader.class;
/*  81 */     this.cachedSerClasses.add(cls);
/*  82 */     this.cachedSerFactories.add(beansf);
/*  83 */     this.cachedDeserFactories.add(beandf);
/*     */ 
/*  85 */     qName = new QName(EAIPropertiesFromDB.ESBEnvelope_ns, ">>ESBEnvelope>MsgBody");
/*  86 */     this.cachedSerQNames.add(qName);
/*  87 */     cls = ESBEnvelopeMsgBody.class;
/*  88 */     this.cachedSerClasses.add(cls);
/*  89 */     this.cachedSerFactories.add(beansf);
/*  90 */     this.cachedDeserFactories.add(beandf);
/*     */ 
/*  92 */     qName = new QName(EAIPropertiesFromDB.ESBEnvelope_ns, ">>ESBEnvelopeResult>ESBHeader");
/*  93 */     this.cachedSerQNames.add(qName);
/*  94 */     cls = ESBEnvelopeResultESBHeader.class;
/*  95 */     this.cachedSerClasses.add(cls);
/*  96 */     this.cachedSerFactories.add(beansf);
/*  97 */     this.cachedDeserFactories.add(beandf);
/*     */ 
/*  99 */     qName = new QName(EAIPropertiesFromDB.ESBEnvelope_ns, ">>ESBEnvelopeResult>MsgBody");
/* 100 */     this.cachedSerQNames.add(qName);
/* 101 */     cls = ESBEnvelopeResultMsgBody.class;
/* 102 */     this.cachedSerClasses.add(cls);
/* 103 */     this.cachedSerFactories.add(beansf);
/* 104 */     this.cachedDeserFactories.add(beandf);
/*     */ 
/* 106 */     qName = new QName(EAIPropertiesFromDB.ESBEnvelope_ns, ">ESBEnvelope");
/* 107 */     this.cachedSerQNames.add(qName);
/* 108 */     cls = ESBEnvelope.class;
/* 109 */     this.cachedSerClasses.add(cls);
/* 110 */     this.cachedSerFactories.add(beansf);
/* 111 */     this.cachedDeserFactories.add(beandf);
/*     */ 
/* 113 */     qName = new QName(EAIPropertiesFromDB.ESBEnvelope_ns, ">ESBEnvelopeResult");
/* 114 */     this.cachedSerQNames.add(qName);
/* 115 */     cls = ESBEnvelopeResult.class;
/* 116 */     this.cachedSerClasses.add(cls);
/* 117 */     this.cachedSerFactories.add(beansf);
/* 118 */     this.cachedDeserFactories.add(beandf);
/*     */   }
/*     */ 
/*     */   protected Call createCall() throws RemoteException
/*     */   {
/*     */     try {
/* 124 */       Call _call = super._createCall();
/* 125 */       if (this.maintainSessionSet) {
/* 126 */         _call.setMaintainSession(this.maintainSession);
/*     */       }
/* 128 */       if (this.cachedUsername != null) {
/* 129 */         _call.setUsername(this.cachedUsername);
/*     */       }
/* 131 */       if (this.cachedPassword != null) {
/* 132 */         _call.setPassword(this.cachedPassword);
/*     */       }
/* 134 */       if (this.cachedEndpoint != null) {
/* 135 */         _call.setTargetEndpointAddress(this.cachedEndpoint);
/*     */       }
/* 137 */       if (this.cachedTimeout != null) {
/* 138 */         _call.setTimeout(this.cachedTimeout);
/*     */       }
/* 140 */       if (this.cachedPortName != null) {
/* 141 */         _call.setPortName(this.cachedPortName);
/*     */       }
/* 143 */       Enumeration keys = this.cachedProperties.keys();
/* 144 */       while (keys.hasMoreElements()) {
/* 145 */         String key = (String)keys.nextElement();
/* 146 */         _call.setProperty(key, this.cachedProperties.get(key));
/*     */       }
/*     */ 
/* 153 */       synchronized (this) {
/* 154 */         if (firstCall())
/*     */         {
/* 156 */           _call.setEncodingStyle(null);
/* 157 */           for (int i = 0; i < this.cachedSerFactories.size(); i++) {
/* 158 */             Class cls = (Class)this.cachedSerClasses.get(i);
/* 159 */             QName qName = 
/* 160 */               (QName)this.cachedSerQNames.get(i);
/* 161 */             Object x = this.cachedSerFactories.get(i);
/* 162 */             if ((x instanceof Class)) {
/* 163 */               Class sf = 
/* 164 */                 (Class)this.cachedSerFactories.get(i);
/* 165 */               Class df = 
/* 166 */                 (Class)this.cachedDeserFactories.get(i);
/* 167 */               _call.registerTypeMapping(cls, qName, sf, df, false);
/*     */             }
/* 169 */             else if ((x instanceof javax.xml.rpc.encoding.SerializerFactory)) {
/* 170 */               org.apache.axis.encoding.SerializerFactory sf = 
/* 171 */                 (org.apache.axis.encoding.SerializerFactory)this.cachedSerFactories.get(i);
/* 172 */               DeserializerFactory df = 
/* 173 */                 (DeserializerFactory)this.cachedDeserFactories.get(i);
/* 174 */               _call.registerTypeMapping(cls, qName, sf, df, false);
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/* 179 */       return _call;
/*     */     } catch (Throwable _t) {
/*     */     }
/* 182 */     throw new AxisFault("Failure trying to get the Call object", _t);
/*     */   }
/*     */ 
/*     */   public ESBEnvelopeResult processMessage(ESBEnvelope ESBEnvelope) throws RemoteException
/*     */   {
/* 187 */     if (this.cachedEndpoint == null) {
/* 188 */       throw new NoEndPointException();
/*     */     }
/* 190 */     Call _call = createCall();
/* 191 */     _call.setOperation(_operations[0]);
/* 192 */     _call.setUseSOAPAction(true);
/* 193 */     _call.setSOAPActionURI(EAIPropertiesFromDB.SoapAction);
/* 194 */     _call.setEncodingStyle(null);
/* 195 */     _call.setProperty("sendXsiTypes", Boolean.FALSE);
/* 196 */     _call.setProperty("sendMultiRefs", Boolean.FALSE);
/* 197 */     _call.setSOAPVersion(SOAPConstants.SOAP12_CONSTANTS);
/* 198 */     _call.setOperationName(new QName(EAIPropertiesFromDB.ProcessMessage_ns, "ProcessMessage"));
/*     */ 
/* 200 */     setRequestHeaders(_call);
/* 201 */     setAttachments(_call);
/*     */     try { Object _resp = _call.invoke(new Object[] { ESBEnvelope });
/*     */ 
/* 204 */       if ((_resp instanceof RemoteException)) {
/* 205 */         throw ((RemoteException)_resp);
/*     */       }
/*     */ 
/* 208 */       extractAttachments(_call);
/*     */       try {
/* 210 */         return (ESBEnvelopeResult)_resp;
/*     */       } catch (Exception _exception) {
/* 212 */         return (ESBEnvelopeResult)JavaUtils.convert(_resp, ESBEnvelopeResult.class);
/*     */       }
/*     */     } catch (AxisFault axisFaultException) {
/*     */     }
/* 216 */     throw axisFaultException;
/*     */   }
/*     */ }

/* Location:           C:\Kevin_File\Java\workspace\MDES\WebContent\WEB-INF\classes\
 * Qualified Name:     com.sinosoft.banklns.lnsmodel.webservice.eai.ESBWebEntrySoap12Stub
 * JD-Core Version:    0.6.0
 */