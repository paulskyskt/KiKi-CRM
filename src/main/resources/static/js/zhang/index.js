layui.define(['layer','form'],function (exports) {

    var layer = layui.layer;
    var from = layui.from;

    // layer.msg('hello world');

    //监听提交
    form.on('submit(formDemo)', function(data){
        layer.msg(JSON.stringify(data.field));
        return false;
    });

    exports('index', {});
})