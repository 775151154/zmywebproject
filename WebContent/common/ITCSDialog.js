$.fn.ITCSDialog = function (options) {
    var defaults = {
        width: 300,
        height: 200,
        title: '此处标题',
        html: '',
        iconCls: '',
        modal: true,
        closed: true,
        submit: function () { alert('可执行代码.'); },
        test: function () {}
    };
    var id = $(this).attr('id');
    options = $.extend(defaults, options);
    var self = this;

    $(self).dialog({
        title: options.title,
        height: options.height,
        width: options.width,
        iconCls: options.iconCls,
        modal: options.modal,
        closed: options.closed
        /*buttons: [{
            text: '确定',
            iconCls: 'icon-ok',
            handler: options.submit
        }, {
            text: '取消',
            iconCls: 'icon-cancel',
            handler: function () {
            	options.test();
                $('#' + id).dialog('close');
            }
        }]*/
    });

    function createContent() {
        $('.dialog-content',$(self)).empty().append('<div id="' + id + '_content" style="padding:5px;">2332</div>');
        $('#' + id + "_content").html(options.html);
    }
    createContent();
};