(window.webpackJsonp=window.webpackJsonp||[]).push([["chunk-692d"],{VU1q:function(e,t,i){"use strict";var n=i("v1g1");i.n(n).a},uMjE:function(e,t,i){"use strict";i.r(t);var n=i("7Qib"),s=i("mqlf"),a=i("ppJE"),l=i("PS1M"),c=i("n1dw"),o=i("xfX+"),r=i("8gwX"),d=i("K6D0"),u=i("7z+D"),h={name:"c-r-m-full-screen-detail",components:{ClueDetail:s.a,CustomerDetail:a.a,ContactsDetail:l.a,BusinessDetail:c.a,ContractDetail:o.a,ProductDetail:r.a,MoneyDetail:d.a,ExamineDetail:u.a},watch:{visible:function(e){this.showDetail=e,e&&(document.body.appendChild(this.$el),this.$el.addEventListener("click",this.handleDocumentClick,!1),this.$el.style.zIndex=Object(n.g)())},showDetail:function(e){var t=this;e||setTimeout(function(){t.$emit("update:visible",!1)},350)}},computed:{tabName:function(){return"leads"==this.crmType?"clue-detail":"customer"==this.crmType?"customer-detail":"contacts"==this.crmType?"contacts-detail":"business"==this.crmType?"business-detail":"contract"==this.crmType?"contract-detail":"product"==this.crmType?"product-detail":"receivables"==this.crmType?"money-detail":"examine"==this.crmType?"examine-detail":""}},data:function(){return{showDetail:!1}},props:{id:[String,Number],crmType:{type:String,default:""},visible:{type:Boolean,default:!1}},mounted:function(){this.visible&&(document.body.appendChild(this.$el),this.$el.addEventListener("click",this.handleDocumentClick,!1),this.$el.style.zIndex=Object(n.g)())},methods:{hiddenView:function(){this.showDetail=!1},handleDocumentClick:function(e){e.stopPropagation(),this.$el==e.target&&(this.showDetail=!1)}},beforeDestroy:function(){this.$el&&this.$el.parentNode&&(this.$el.parentNode.removeChild(this.$el),this.$el.removeEventListener("click",this.handleDocumentClick,!1))}},m=(i("VU1q"),i("ZrdR")),p=Object(m.a)(h,function(){var e=this,t=e.$createElement,i=e._self._c||t;return i("div",{directives:[{name:"show",rawName:"v-show",value:e.visible,expression:"visible"}],staticClass:"full-container"},[e.id&&e.showDetail?i(e.tabName,{tag:"component",staticClass:"d-view",attrs:{crmType:e.crmType,id:e.id},on:{"hide-view":e.hiddenView}}):e._e()],1)},[],!1,null,"2cff152a",null);p.options.__file="CRMFullScreenDetail.vue";t.default=p.exports},v1g1:function(e,t,i){}}]);