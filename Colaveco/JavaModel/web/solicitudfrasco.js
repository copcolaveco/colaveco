gx.evt.autoSkip=!1;gx.define("solicitudfrasco",!1,function(){this.ServerClass="solicitudfrasco";this.PackageName="com.colaveco";this.ServerFullClass="com.colaveco.solicitudfrasco";this.setObjectType("trn");this.hasEnterEvent=!0;this.skipOnEnter=!1;this.fullAjax=!0;this.supportAjaxEvents=!0;this.ajaxSecurityToken=!0;this.SetStandaloneVars=function(){};this.Valid_Sfid=function(){return this.validSrvEvt("valid_Sfid",0).then(function(n){return n}.closure(this))};this.Valid_Sffechacreacion=function(){return this.validCliEvt("Valid_Sffechacreacion",0,function(){try{var n=gx.util.balloon.getNew("SFFECHACREACION");if(this.AnyError=0,!(new gx.date.gxdate("").compare(this.A42SFFechaCreacion)===0||new gx.date.gxdate(this.A42SFFechaCreacion).compare(gx.date.ymdhmstot(1e3,1,1,0,0,0))>=0))try{n.setError("Field SFFecha Creacion is out of range");this.AnyError=gx.num.trunc(1,0)}catch(t){}}catch(t){}try{return n==null?!0:n.show()}catch(t){}return!0})};this.Valid_Sffechamodificado=function(){return this.validCliEvt("Valid_Sffechamodificado",0,function(){try{var n=gx.util.balloon.getNew("SFFECHAMODIFICADO");if(this.AnyError=0,!(new gx.date.gxdate("").compare(this.A43SFFechaModificado)===0||new gx.date.gxdate(this.A43SFFechaModificado).compare(gx.date.ymdhmstot(1e3,1,1,0,0,0))>=0))try{n.setError("Field SFFecha Modificado is out of range");this.AnyError=gx.num.trunc(1,0)}catch(t){}}catch(t){}try{return n==null?!0:n.show()}catch(t){}return!0})};this.e11033_client=function(){return this.executeServerEvent("ENTER",!0,null,!1,!1)};this.e12033_client=function(){return this.executeServerEvent("CANCEL",!0,null,!1,!1)};this.GXValidFnc=[];var n=this.GXValidFnc;this.GXCtrlIds=[2,3,4,5,6,7,8,9,10,11,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113];this.GXLastCtrlId=113;n[2]={id:2,fld:"",grid:0};n[3]={id:3,fld:"MAINTABLE",grid:0};n[4]={id:4,fld:"",grid:0};n[5]={id:5,fld:"",grid:0};n[6]={id:6,fld:"TITLECONTAINER",grid:0};n[7]={id:7,fld:"",grid:0};n[8]={id:8,fld:"",grid:0};n[9]={id:9,fld:"TITLE",format:0,grid:0,ctrltype:"textblock"};n[10]={id:10,fld:"",grid:0};n[11]={id:11,fld:"",grid:0};n[13]={id:13,fld:"",grid:0};n[14]={id:14,fld:"",grid:0};n[15]={id:15,fld:"FORMCONTAINER",grid:0};n[16]={id:16,fld:"",grid:0};n[17]={id:17,fld:"TOOLBARCELL",grid:0};n[18]={id:18,fld:"",grid:0};n[19]={id:19,fld:"",grid:0};n[20]={id:20,fld:"",grid:0};n[21]={id:21,fld:"BTN_FIRST",grid:0,evt:"e13033_client",std:"FIRST"};n[22]={id:22,fld:"",grid:0};n[23]={id:23,fld:"BTN_PREVIOUS",grid:0,evt:"e14033_client",std:"PREVIOUS"};n[24]={id:24,fld:"",grid:0};n[25]={id:25,fld:"BTN_NEXT",grid:0,evt:"e15033_client",std:"NEXT"};n[26]={id:26,fld:"",grid:0};n[27]={id:27,fld:"BTN_LAST",grid:0,evt:"e16033_client",std:"LAST"};n[28]={id:28,fld:"",grid:0};n[29]={id:29,fld:"BTN_SELECT",grid:0,evt:"e17033_client",std:"SELECT"};n[30]={id:30,fld:"",grid:0};n[31]={id:31,fld:"",grid:0};n[32]={id:32,fld:"",grid:0};n[33]={id:33,fld:"",grid:0};n[34]={id:34,lvl:0,type:"int",len:18,dec:0,sign:!1,pic:"ZZZZZZZZZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Sfid,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"SFID",gxz:"Z3SFId",gxold:"O3SFId",gxvar:"A3SFId",ucs:[],op:[104,99,94,89,84,79,74,69,64,59,54,49,44,39],ip:[104,99,94,89,84,79,74,69,64,59,54,49,44,39,34],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A3SFId=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z3SFId=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("SFID",gx.O.A3SFId,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){this.val()!==undefined&&(gx.O.A3SFId=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("SFID",",")},nac:gx.falseFn};this.declareDomainHdlr(34,function(){});n[35]={id:35,fld:"",grid:0};n[36]={id:36,fld:"",grid:0};n[37]={id:37,fld:"",grid:0};n[38]={id:38,fld:"",grid:0};n[39]={id:39,lvl:0,type:"int",len:18,dec:0,sign:!1,pic:"ZZZZZZZZZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"SFIDNET",gxz:"Z32SFIdNet",gxold:"O32SFIdNet",gxvar:"A32SFIdNet",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A32SFIdNet=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z32SFIdNet=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("SFIDNET",gx.O.A32SFIdNet,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){this.val()!==undefined&&(gx.O.A32SFIdNet=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("SFIDNET",",")},nac:gx.falseFn};this.declareDomainHdlr(39,function(){});n[40]={id:40,fld:"",grid:0};n[41]={id:41,fld:"",grid:0};n[42]={id:42,fld:"",grid:0};n[43]={id:43,fld:"",grid:0};n[44]={id:44,lvl:0,type:"svchar",len:100,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"SFNOMBRE",gxz:"Z33SFNombre",gxold:"O33SFNombre",gxvar:"A33SFNombre",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A33SFNombre=n)},v2z:function(n){n!==undefined&&(gx.O.Z33SFNombre=n)},v2c:function(){gx.fn.setControlValue("SFNOMBRE",gx.O.A33SFNombre,0)},c2v:function(){this.val()!==undefined&&(gx.O.A33SFNombre=this.val())},val:function(){return gx.fn.getControlValue("SFNOMBRE")},nac:gx.falseFn};n[45]={id:45,fld:"",grid:0};n[46]={id:46,fld:"",grid:0};n[47]={id:47,fld:"",grid:0};n[48]={id:48,fld:"",grid:0};n[49]={id:49,lvl:0,type:"svchar",len:100,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"SFDIRECCION",gxz:"Z34SFDireccion",gxold:"O34SFDireccion",gxvar:"A34SFDireccion",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A34SFDireccion=n)},v2z:function(n){n!==undefined&&(gx.O.Z34SFDireccion=n)},v2c:function(){gx.fn.setControlValue("SFDIRECCION",gx.O.A34SFDireccion,0)},c2v:function(){this.val()!==undefined&&(gx.O.A34SFDireccion=this.val())},val:function(){return gx.fn.getControlValue("SFDIRECCION")},nac:gx.falseFn};n[50]={id:50,fld:"",grid:0};n[51]={id:51,fld:"",grid:0};n[52]={id:52,fld:"",grid:0};n[53]={id:53,fld:"",grid:0};n[54]={id:54,lvl:0,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"SFAGENCIA",gxz:"Z35SFAgencia",gxold:"O35SFAgencia",gxvar:"A35SFAgencia",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A35SFAgencia=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z35SFAgencia=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("SFAGENCIA",gx.O.A35SFAgencia,0)},c2v:function(){this.val()!==undefined&&(gx.O.A35SFAgencia=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("SFAGENCIA",",")},nac:gx.falseFn};n[55]={id:55,fld:"",grid:0};n[56]={id:56,fld:"",grid:0};n[57]={id:57,fld:"",grid:0};n[58]={id:58,fld:"",grid:0};n[59]={id:59,lvl:0,type:"svchar",len:50,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"SFTELEFONO",gxz:"Z36SFTelefono",gxold:"O36SFTelefono",gxvar:"A36SFTelefono",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A36SFTelefono=n)},v2z:function(n){n!==undefined&&(gx.O.Z36SFTelefono=n)},v2c:function(){gx.fn.setControlValue("SFTELEFONO",gx.O.A36SFTelefono,0)},c2v:function(){this.val()!==undefined&&(gx.O.A36SFTelefono=this.val())},val:function(){return gx.fn.getControlValue("SFTELEFONO")},nac:gx.falseFn};n[60]={id:60,fld:"",grid:0};n[61]={id:61,fld:"",grid:0};n[62]={id:62,fld:"",grid:0};n[63]={id:63,fld:"",grid:0};n[64]={id:64,lvl:0,type:"svchar",len:100,dec:0,sign:!1,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"SFEMAIL",gxz:"Z37SFEmail",gxold:"O37SFEmail",gxvar:"A37SFEmail",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A37SFEmail=n)},v2z:function(n){n!==undefined&&(gx.O.Z37SFEmail=n)},v2c:function(){gx.fn.setControlValue("SFEMAIL",gx.O.A37SFEmail,0)},c2v:function(){this.val()!==undefined&&(gx.O.A37SFEmail=this.val())},val:function(){return gx.fn.getControlValue("SFEMAIL")},nac:gx.falseFn};n[65]={id:65,fld:"",grid:0};n[66]={id:66,fld:"",grid:0};n[67]={id:67,fld:"",grid:0};n[68]={id:68,fld:"",grid:0};n[69]={id:69,lvl:0,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"SFFRASCOSCONC",gxz:"Z38SFFrascosConC",gxold:"O38SFFrascosConC",gxvar:"A38SFFrascosConC",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A38SFFrascosConC=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z38SFFrascosConC=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("SFFRASCOSCONC",gx.O.A38SFFrascosConC,0)},c2v:function(){this.val()!==undefined&&(gx.O.A38SFFrascosConC=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("SFFRASCOSCONC",",")},nac:gx.falseFn};n[70]={id:70,fld:"",grid:0};n[71]={id:71,fld:"",grid:0};n[72]={id:72,fld:"",grid:0};n[73]={id:73,fld:"",grid:0};n[74]={id:74,lvl:0,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"SFFRASCOSSINC",gxz:"Z39SFFrascosSinC",gxold:"O39SFFrascosSinC",gxvar:"A39SFFrascosSinC",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A39SFFrascosSinC=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z39SFFrascosSinC=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("SFFRASCOSSINC",gx.O.A39SFFrascosSinC,0)},c2v:function(){this.val()!==undefined&&(gx.O.A39SFFrascosSinC=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("SFFRASCOSSINC",",")},nac:gx.falseFn};n[75]={id:75,fld:"",grid:0};n[76]={id:76,fld:"",grid:0};n[77]={id:77,fld:"",grid:0};n[78]={id:78,fld:"",grid:0};n[79]={id:79,lvl:0,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"SFFRASCOSAGUA",gxz:"Z167SFFrascosAgua",gxold:"O167SFFrascosAgua",gxvar:"A167SFFrascosAgua",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A167SFFrascosAgua=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z167SFFrascosAgua=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("SFFRASCOSAGUA",gx.O.A167SFFrascosAgua,0)},c2v:function(){this.val()!==undefined&&(gx.O.A167SFFrascosAgua=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("SFFRASCOSAGUA",",")},nac:gx.falseFn};n[80]={id:80,fld:"",grid:0};n[81]={id:81,fld:"",grid:0};n[82]={id:82,fld:"",grid:0};n[83]={id:83,fld:"",grid:0};n[84]={id:84,lvl:0,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"SFFRASCOSSANGRE",gxz:"Z40SFFrascosSangre",gxold:"O40SFFrascosSangre",gxvar:"A40SFFrascosSangre",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A40SFFrascosSangre=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z40SFFrascosSangre=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("SFFRASCOSSANGRE",gx.O.A40SFFrascosSangre,0)},c2v:function(){this.val()!==undefined&&(gx.O.A40SFFrascosSangre=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("SFFRASCOSSANGRE",",")},nac:gx.falseFn};n[85]={id:85,fld:"",grid:0};n[86]={id:86,fld:"",grid:0};n[87]={id:87,fld:"",grid:0};n[88]={id:88,fld:"",grid:0};n[89]={id:89,lvl:0,type:"svchar",len:200,dec:0,sign:!1,ro:0,multiline:!0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"SFOBSERVACIONES",gxz:"Z41SFObservaciones",gxold:"O41SFObservaciones",gxvar:"A41SFObservaciones",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A41SFObservaciones=n)},v2z:function(n){n!==undefined&&(gx.O.Z41SFObservaciones=n)},v2c:function(){gx.fn.setControlValue("SFOBSERVACIONES",gx.O.A41SFObservaciones,0)},c2v:function(){this.val()!==undefined&&(gx.O.A41SFObservaciones=this.val())},val:function(){return gx.fn.getControlValue("SFOBSERVACIONES")},nac:gx.falseFn};n[90]={id:90,fld:"",grid:0};n[91]={id:91,fld:"",grid:0};n[92]={id:92,fld:"",grid:0};n[93]={id:93,fld:"",grid:0};n[94]={id:94,lvl:0,type:"dtime",len:8,dec:5,sign:!1,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Sffechacreacion,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"SFFECHACREACION",gxz:"Z42SFFechaCreacion",gxold:"O42SFFechaCreacion",gxvar:"A42SFFechaCreacion",dp:{f:0,st:!0,wn:!1,mf:!1,pic:"99/99/99 99:99",dec:5},ucs:[],op:[94],ip:[94],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A42SFFechaCreacion=gx.fn.toDatetimeValue(n))},v2z:function(n){n!==undefined&&(gx.O.Z42SFFechaCreacion=gx.fn.toDatetimeValue(n))},v2c:function(){gx.fn.setControlValue("SFFECHACREACION",gx.O.A42SFFechaCreacion,0)},c2v:function(){this.val()!==undefined&&(gx.O.A42SFFechaCreacion=gx.fn.toDatetimeValue(this.val()))},val:function(){return gx.fn.getDateTimeValue("SFFECHACREACION")},nac:gx.falseFn};n[95]={id:95,fld:"",grid:0};n[96]={id:96,fld:"",grid:0};n[97]={id:97,fld:"",grid:0};n[98]={id:98,fld:"",grid:0};n[99]={id:99,lvl:0,type:"dtime",len:8,dec:5,sign:!1,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Sffechamodificado,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"SFFECHAMODIFICADO",gxz:"Z43SFFechaModificado",gxold:"O43SFFechaModificado",gxvar:"A43SFFechaModificado",dp:{f:0,st:!0,wn:!1,mf:!1,pic:"99/99/99 99:99",dec:5},ucs:[],op:[99],ip:[99],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A43SFFechaModificado=gx.fn.toDatetimeValue(n))},v2z:function(n){n!==undefined&&(gx.O.Z43SFFechaModificado=gx.fn.toDatetimeValue(n))},v2c:function(){gx.fn.setControlValue("SFFECHAMODIFICADO",gx.O.A43SFFechaModificado,0)},c2v:function(){this.val()!==undefined&&(gx.O.A43SFFechaModificado=gx.fn.toDatetimeValue(this.val()))},val:function(){return gx.fn.getDateTimeValue("SFFECHAMODIFICADO")},nac:gx.falseFn};n[100]={id:100,fld:"",grid:0};n[101]={id:101,fld:"",grid:0};n[102]={id:102,fld:"",grid:0};n[103]={id:103,fld:"",grid:0};n[104]={id:104,lvl:0,type:"int",len:4,dec:0,sign:!1,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,evt_cvc:null,evt_cvcing:null,rgrid:[],fld:"SFFRASCOSISOPO",gxz:"Z44SFFrascosIsopo",gxold:"O44SFFrascosIsopo",gxvar:"A44SFFrascosIsopo",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(n){n!==undefined&&(gx.O.A44SFFrascosIsopo=gx.num.intval(n))},v2z:function(n){n!==undefined&&(gx.O.Z44SFFrascosIsopo=gx.num.intval(n))},v2c:function(){gx.fn.setControlValue("SFFRASCOSISOPO",gx.O.A44SFFrascosIsopo,0)},c2v:function(){this.val()!==undefined&&(gx.O.A44SFFrascosIsopo=gx.num.intval(this.val()))},val:function(){return gx.fn.getIntegerValue("SFFRASCOSISOPO",",")},nac:gx.falseFn};n[105]={id:105,fld:"",grid:0};n[106]={id:106,fld:"",grid:0};n[107]={id:107,fld:"",grid:0};n[108]={id:108,fld:"",grid:0};n[109]={id:109,fld:"BTN_ENTER",grid:0,evt:"e11033_client",std:"ENTER"};n[110]={id:110,fld:"",grid:0};n[111]={id:111,fld:"BTN_CANCEL",grid:0,evt:"e12033_client"};n[112]={id:112,fld:"",grid:0};n[113]={id:113,fld:"BTN_DELETE",grid:0,evt:"e18033_client",std:"DELETE"};this.A3SFId=0;this.Z3SFId=0;this.O3SFId=0;this.A32SFIdNet=0;this.Z32SFIdNet=0;this.O32SFIdNet=0;this.A33SFNombre="";this.Z33SFNombre="";this.O33SFNombre="";this.A34SFDireccion="";this.Z34SFDireccion="";this.O34SFDireccion="";this.A35SFAgencia=0;this.Z35SFAgencia=0;this.O35SFAgencia=0;this.A36SFTelefono="";this.Z36SFTelefono="";this.O36SFTelefono="";this.A37SFEmail="";this.Z37SFEmail="";this.O37SFEmail="";this.A38SFFrascosConC=0;this.Z38SFFrascosConC=0;this.O38SFFrascosConC=0;this.A39SFFrascosSinC=0;this.Z39SFFrascosSinC=0;this.O39SFFrascosSinC=0;this.A167SFFrascosAgua=0;this.Z167SFFrascosAgua=0;this.O167SFFrascosAgua=0;this.A40SFFrascosSangre=0;this.Z40SFFrascosSangre=0;this.O40SFFrascosSangre=0;this.A41SFObservaciones="";this.Z41SFObservaciones="";this.O41SFObservaciones="";this.A42SFFechaCreacion=gx.date.nullDate();this.Z42SFFechaCreacion=gx.date.nullDate();this.O42SFFechaCreacion=gx.date.nullDate();this.A43SFFechaModificado=gx.date.nullDate();this.Z43SFFechaModificado=gx.date.nullDate();this.O43SFFechaModificado=gx.date.nullDate();this.A44SFFrascosIsopo=0;this.Z44SFFrascosIsopo=0;this.O44SFFrascosIsopo=0;this.A3SFId=0;this.A32SFIdNet=0;this.A33SFNombre="";this.A34SFDireccion="";this.A35SFAgencia=0;this.A36SFTelefono="";this.A37SFEmail="";this.A38SFFrascosConC=0;this.A39SFFrascosSinC=0;this.A167SFFrascosAgua=0;this.A40SFFrascosSangre=0;this.A41SFObservaciones="";this.A42SFFechaCreacion=gx.date.nullDate();this.A43SFFechaModificado=gx.date.nullDate();this.A44SFFrascosIsopo=0;this.Events={e11033_client:["ENTER",!0],e12033_client:["CANCEL",!0]};this.EvtParms.ENTER=[[{postForm:!0}],[]];this.EvtParms.REFRESH=[[],[]];this.EvtParms.VALID_SFID=[[{av:"A3SFId",fld:"SFID",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"Gx_mode",fld:"vMODE",pic:"@!"}],[{av:"A32SFIdNet",fld:"SFIDNET",pic:"ZZZZZZZZZZZZZZZZZ9"},{av:"A33SFNombre",fld:"SFNOMBRE",pic:""},{av:"A34SFDireccion",fld:"SFDIRECCION",pic:""},{av:"A35SFAgencia",fld:"SFAGENCIA",pic:"ZZZ9"},{av:"A36SFTelefono",fld:"SFTELEFONO",pic:""},{av:"A37SFEmail",fld:"SFEMAIL",pic:""},{av:"A38SFFrascosConC",fld:"SFFRASCOSCONC",pic:"ZZZ9"},{av:"A39SFFrascosSinC",fld:"SFFRASCOSSINC",pic:"ZZZ9"},{av:"A167SFFrascosAgua",fld:"SFFRASCOSAGUA",pic:"ZZZ9"},{av:"A40SFFrascosSangre",fld:"SFFRASCOSSANGRE",pic:"ZZZ9"},{av:"A41SFObservaciones",fld:"SFOBSERVACIONES",pic:""},{av:"A42SFFechaCreacion",fld:"SFFECHACREACION",pic:"99/99/99 99:99"},{av:"A43SFFechaModificado",fld:"SFFECHAMODIFICADO",pic:"99/99/99 99:99"},{av:"A44SFFrascosIsopo",fld:"SFFRASCOSISOPO",pic:"ZZZ9"},{av:"Gx_mode",fld:"vMODE",pic:"@!"},{av:"Z3SFId"},{av:"Z32SFIdNet"},{av:"Z33SFNombre"},{av:"Z34SFDireccion"},{av:"Z35SFAgencia"},{av:"Z36SFTelefono"},{av:"Z37SFEmail"},{av:"Z38SFFrascosConC"},{av:"Z39SFFrascosSinC"},{av:"Z167SFFrascosAgua"},{av:"Z40SFFrascosSangre"},{av:"Z41SFObservaciones"},{av:"Z42SFFechaCreacion"},{av:"Z43SFFechaModificado"},{av:"Z44SFFrascosIsopo"},{ctrl:"BTN_DELETE",prop:"Enabled"},{ctrl:"BTN_ENTER",prop:"Enabled"}]];this.EvtParms.VALID_SFFECHACREACION=[[{av:"A42SFFechaCreacion",fld:"SFFECHACREACION",pic:"99/99/99 99:99"}],[{av:"A42SFFechaCreacion",fld:"SFFECHACREACION",pic:"99/99/99 99:99"}]];this.EvtParms.VALID_SFFECHAMODIFICADO=[[{av:"A43SFFechaModificado",fld:"SFFECHAMODIFICADO",pic:"99/99/99 99:99"}],[{av:"A43SFFechaModificado",fld:"SFFECHAMODIFICADO",pic:"99/99/99 99:99"}]];this.EnterCtrl=["BTN_ENTER"];this.Initialize()});gx.wi(function(){gx.createParentObj(this.solicitudfrasco)})