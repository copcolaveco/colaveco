gx.evt.autoSkip=!1;gx.define("notificacionesgeneral",!0,function(n){this.ServerClass="notificacionesgeneral";this.PackageName="com.colaveco";this.ServerFullClass="com.colaveco.notificacionesgeneral";this.setObjectType("web");this.setCmpContext(n);this.ReadonlyForm=!0;this.hasEnterEvent=!1;this.skipOnEnter=!1;this.autoRefresh=!0;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.SetStandaloneVars=function(){};this.Valid_Notificacionesid=function(){return this.validCliEvt("Valid_Notificacionesid",0,function(){try{var n=gx.util.balloon.getNew("NOTIFICACIONESID");this.AnyError=0}catch(t){}try{return n==null?!0:n.show()}catch(t){}return!0})};this.e110w1_client=function(){return this.clearMessages(),this.call("com.colaveco.notificaciones",["UPD",this.A6NotificacionesId],null,["Mode","NotificacionesId"]),this.refreshOutputs([]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e120w1_client=function(){return this.clearMessages(),this.call("com.colaveco.notificaciones",["DLT",this.A6NotificacionesId],null,["Mode","NotificacionesId"]),this.refreshOutputs([]),this.OnClientEventEnd(),gx.$.Deferred().resolve()};this.e150w2_client=function(){return this.executeServerEvent("ENTER",!0,null,!1,!1)};this.e160w2_client=function(){return this.executeServerEvent("CANCEL",!0,null,!1,!1)};this.GXValidFnc=[];var t=this.GXValidFnc;this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43];this.GXLastCtrlId=43;t[2]={id:2,fld:"",grid:0};t[3]={id:3,fld:"MAINTABLE",grid:0};t[4]={id:4,fld:"",grid:0};t[5]={id:5,fld:"",grid:0};t[6]={id:6,fld:"",grid:0};t[7]={id:7,fld:"",grid:0};t[8]={id:8,fld:"BTNUPDATE",grid:0,evt:"e110w1_client"};t[9]={id:9,fld:"",grid:0};t[10]={id:10,fld:"BTNDELETE",grid:0,evt:"e120w1_client"};t[11]={id:11,fld:"",grid:0};t[12]={id:12,fld:"",grid:0};t[13]={id:13,fld:"ATTRIBUTESTABLE",grid:0};t[14]={id:14,fld:"",grid:0};t[15]={id:15,fld:"",grid:0};t[16]={id:16,fld:"",grid:0};t[17]={id:17,fld:"",grid:0};t[18]={id:18,lvl:0,type:"int",len:18,dec:0,sign:!1,pic:"ZZZZZZZZZZZZZZZZZ9",ro:1,grid:0,gxgrid:null,fnc:this.Valid_Notificacionesid,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"NOTIFICACIONESID",gxz:"Z6NotificacionesId",gxold:"O6NotificacionesId",gxvar:"A6NotificacionesId",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A6NotificacionesId=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z6NotificacionesId=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("NOTIFICACIONESID",gx.O.A6NotificacionesId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){this.val()!==undefined&&(gx.O.A6NotificacionesId=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("NOTIFICACIONESID",",")},nac:gx.falseFn};this.declareDomainHdlr(18,function(){});t[19]={id:19,fld:"",grid:0};t[20]={id:20,fld:"",grid:0};t[21]={id:21,fld:"",grid:0};t[22]={id:22,fld:"",grid:0};t[23]={id:23,lvl:0,type:"dtime",len:8,dec:5,sign:!1,ro:1,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"NOTIFICACIONESFECHA",gxz:"Z169NotificacionesFecha",gxold:"O169NotificacionesFecha",gxvar:"A169NotificacionesFecha",dp:{f:0,st:!0,wn:!1,mf:!1,pic:"99/99/99 99:99",dec:5},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A169NotificacionesFecha=gx.fn.toDatetimeValue(n))},v2z:function(n){n!==undefined&&(gx.O.Z169NotificacionesFecha=gx.fn.toDatetimeValue(n))},v2c:function(){gx.fn.setControlValue("NOTIFICACIONESFECHA",gx.O.A169NotificacionesFecha,0)},c2v:function(){this.val()!==undefined&&(gx.O.A169NotificacionesFecha=gx.fn.toDatetimeValue(this.val()))},val:function(){return gx.fn.getDateTimeValue("NOTIFICACIONESFECHA")},nac:gx.falseFn};t[24]={id:24,fld:"",grid:0};t[25]={id:25,fld:"",grid:0};t[26]={id:26,fld:"",grid:0};t[27]={id:27,fld:"",grid:0};t[28]={id:28,lvl:0,type:"svchar",len:40,dec:0,sign:!1,ro:1,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"NOTIFICACIONESTIPO",gxz:"Z170NotificacionesTipo",gxold:"O170NotificacionesTipo",gxvar:"A170NotificacionesTipo",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A170NotificacionesTipo=n)},v2z:function(n){n!==undefined&&(gx.O.Z170NotificacionesTipo=n)},v2c:function(){gx.fn.setControlValue("NOTIFICACIONESTIPO",gx.O.A170NotificacionesTipo,0)},c2v:function(){this.val()!==undefined&&(gx.O.A170NotificacionesTipo=this.val())},val:function(){return gx.fn.getControlValue("NOTIFICACIONESTIPO")},nac:gx.falseFn};t[29]={id:29,fld:"",grid:0};t[30]={id:30,fld:"",grid:0};t[31]={id:31,fld:"",grid:0};t[32]={id:32,fld:"",grid:0};t[33]={id:33,lvl:0,type:"svchar",len:256,dec:0,sign:!1,ro:1,multiline:!0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"NOTIFICACIONESMENSAJE",gxz:"Z171NotificacionesMensaje",gxold:"O171NotificacionesMensaje",gxvar:"A171NotificacionesMensaje",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A171NotificacionesMensaje=n)},v2z:function(n){n!==undefined&&(gx.O.Z171NotificacionesMensaje=n)},v2c:function(){gx.fn.setControlValue("NOTIFICACIONESMENSAJE",gx.O.A171NotificacionesMensaje,0)},c2v:function(){this.val()!==undefined&&(gx.O.A171NotificacionesMensaje=this.val())},val:function(){return gx.fn.getControlValue("NOTIFICACIONESMENSAJE")},nac:gx.falseFn};t[34]={id:34,fld:"",grid:0};t[35]={id:35,fld:"",grid:0};t[36]={id:36,fld:"",grid:0};t[37]={id:37,fld:"",grid:0};t[38]={id:38,lvl:0,type:"int",len:18,dec:0,sign:!1,pic:"ZZZZZZZZZZZZZZZZZ9",ro:1,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"NOTIFICACIONESIDNETUSUARIO",gxz:"Z172NotificacionesIdNetUsuario",gxold:"O172NotificacionesIdNetUsuario",gxvar:"A172NotificacionesIdNetUsuario",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A172NotificacionesIdNetUsuario=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z172NotificacionesIdNetUsuario=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("NOTIFICACIONESIDNETUSUARIO",gx.O.A172NotificacionesIdNetUsuario,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){this.val()!==undefined&&(gx.O.A172NotificacionesIdNetUsuario=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("NOTIFICACIONESIDNETUSUARIO",",")},nac:gx.falseFn};this.declareDomainHdlr(38,function(){});t[39]={id:39,fld:"",grid:0};t[40]={id:40,fld:"",grid:0};t[41]={id:41,fld:"",grid:0};t[42]={id:42,fld:"",grid:0};t[43]={id:43,lvl:0,type:"svchar",len:40,dec:0,sign:!1,ro:1,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"NOTIFICACIONESDETALLE",gxz:"Z173NotificacionesDetalle",gxold:"O173NotificacionesDetalle",gxvar:"A173NotificacionesDetalle",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A173NotificacionesDetalle=n)},v2z:function(n){n!==undefined&&(gx.O.Z173NotificacionesDetalle=n)},v2c:function(){gx.fn.setControlValue("NOTIFICACIONESDETALLE",gx.O.A173NotificacionesDetalle,0)},c2v:function(){this.val()!==undefined&&(gx.O.A173NotificacionesDetalle=this.val())},val:function(){return gx.fn.getControlValue("NOTIFICACIONESDETALLE")},nac:gx.falseFn};this.A6NotificacionesId=0;this.Z6NotificacionesId=0;this.O6NotificacionesId=0;this.A169NotificacionesFecha=gx.date.nullDate();this.Z169NotificacionesFecha=gx.date.nullDate();this.O169NotificacionesFecha=gx.date.nullDate();this.A170NotificacionesTipo="";this.Z170NotificacionesTipo="";this.O170NotificacionesTipo="";this.A171NotificacionesMensaje="";this.Z171NotificacionesMensaje="";this.O171NotificacionesMensaje="";this.A172NotificacionesIdNetUsuario=0;this.Z172NotificacionesIdNetUsuario=0;this.O172NotificacionesIdNetUsuario=0;this.A173NotificacionesDetalle="";this.Z173NotificacionesDetalle="";this.O173NotificacionesDetalle="";this.A6NotificacionesId=0;this.A169NotificacionesFecha=gx.date.nullDate();this.A170NotificacionesTipo="";this.A171NotificacionesMensaje="";this.A172NotificacionesIdNetUsuario=0;this.A173NotificacionesDetalle="";this.Events={e150w2_client:["ENTER",!0],e160w2_client:["CANCEL",!0],e110w1_client:["'DOUPDATE'",!1],e120w1_client:["'DODELETE'",!1]};this.EvtParms.REFRESH=[[{av:"A6NotificacionesId",fld:"NOTIFICACIONESID",pic:"ZZZZZZZZZZZZZZZZZ9"}],[]];this.EvtParms.START=[[{av:"AV13Pgmname",fld:"vPGMNAME",pic:""},{av:"AV6NotificacionesId",fld:"vNOTIFICACIONESID",pic:"ZZZZZZZZZZZZZZZZZ9"}],[]];this.EvtParms.LOAD=[[],[]];this.EvtParms["'DOUPDATE'"]=[[{av:"A6NotificacionesId",fld:"NOTIFICACIONESID",pic:"ZZZZZZZZZZZZZZZZZ9"}],[]];this.EvtParms["'DODELETE'"]=[[{av:"A6NotificacionesId",fld:"NOTIFICACIONESID",pic:"ZZZZZZZZZZZZZZZZZ9"}],[]];this.EvtParms.VALID_NOTIFICACIONESID=[[],[]];this.Initialize()})