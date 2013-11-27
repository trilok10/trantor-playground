/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(function() {
          $('.datepick').each(function(){
                $(this).datepicker({
                    changeMonth : true,
                    changeYear  : true
                });
          });
});
