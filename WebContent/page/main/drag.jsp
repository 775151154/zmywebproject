<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>demo</title>
<style type="text/css">
        .grid-stack {
            background: lightgoldenrodyellow;
        }

        .grid-stack-item-content {
            color: #2c3e50;
            text-align: center;
            background-color: #18bc9c;
        }
    </style>
	<link rel="stylesheet" href="../css/gridstack.css"/>

<script src="../js/jquery.min.js"></script>
<script src="http://libs.baidu.com/jqueryui/1.10.4/jquery-ui.min.js"></script>
<script src="http://libs.baidu.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="../js/lodash.min.js"></script>
<script src="../js/gridstack.js"></script>
</head>
<body>
	<div>
		<a class="btn btn-default" id="add-new-widget" href="#">Add Widget</a>
	</div>
	<div>
		<a class="btn btn-default" id="save-grid" href="#">Save Grid</a> <a
			class="btn btn-default" id="load-grid" href="#">Load Grid</a> <a
			class="btn btn-default" id="clear-grid" href="#">Clear Grid</a>
	</div>
	
	<a id="aaaa" onclick="onclick1()" href="#">test btn</a>

	<div class="grid-stack" style=""></div>

	<textarea id="saved-data" cols="100" rows="20" readonly></textarea>

	<script type="text/javascript">
	$(function () {
        var options = {
        };
        $('.grid-stack').gridstack(options);

        new function () {
            this.serialized_data = [
                {x: 0, y: 0, width: 2, height: 2},
                {x: 3, y: 1, width: 1, height: 2},
                {x: 4, y: 1, width: 1, height: 1},
                {x: 2, y: 3, width: 3, height: 1},
                {x: 1, y: 4, width: 1, height: 1},
                {x: 1, y: 3, width: 1, height: 1},
                {x: 2, y: 4, width: 1, height: 1},
                {x: 2, y: 5, width: 1, height: 1}
            ];

            this.items = [
                          {x: 0, y: 0, width: 2, height: 2},
                          {x: 3, y: 1, width: 1, height: 2},
                          {x: 4, y: 1, width: 1, height: 1},
                          {x: 2, y: 3, width: 3, height: 1},
//                          {x: 1, y: 4, width: 1, height: 1},
//                          {x: 1, y: 3, width: 1, height: 1},
//                          {x: 2, y: 4, width: 1, height: 1},
                          {x: 2, y: 5, width: 1, height: 1}
                      ];
            this.grid = $('.grid-stack').data('gridstack');
            grid = this.grid;
            
            // 新增
            this.add_new_widget = function () {
                var node = this.items.pop() || {
                            x: 12 * Math.random(),
                            y: 5 * Math.random(),
                            width: 1 + 3 * Math.random(),
                            height: 1 + 3 * Math.random()
                        };
                this.grid.add_widget($('<div><div class="grid-stack-item-content" /><div/>'),
                    node.x, node.y, node.width, node.height);
            }.bind(this);

            var i = 1;
            // 加载
            this.load_grid = function () {
                this.grid.remove_all();
                var items = GridStackUI.Utils.sort(this.serialized_data);
                _.each(items, function (node) {
                    this.grid.add_widget($('<div><div class="grid-stack-item-content" /><div/>'),
                        node.x, node.y, node.width, node.height);
	                if(node.innerHTML) {
						this.grid.container.get(0).childNodes[i].innerHTML=node.innerHTML;
	                }
                }, this);
                i = 1;
            }.bind(this);

            // 保存
            this.save_grid = function () {
                this.serialized_data = _.map($('.grid-stack > .grid-stack-item:visible'), function (el) {
                    el = $(el);
                    var node = el.data('_gridstack_node');
                    return {
                        x: node.x,
                        y: node.y,
                        width: node.width,
                        height: node.height,
                        innerHTML: node.el.get(0).innerHTML
                    };
                }, this);
                $('#saved-data').val(JSON.stringify(this.serialized_data, null, '    '));
            }.bind(this);

            // 清空
            this.clear_grid = function () {
                this.grid.remove_all();
            }.bind(this);

            $('#add-new-widget').click(this.add_new_widget);
            $('#save-grid').click(this.save_grid);
            $('#load-grid').click(this.load_grid);
            $('#clear-grid').click(this.clear_grid);

            this.load_grid();
        };
    });
	
	var grid;
	function onclick1(){
		debugger
		$('.grid-stack').get(0).children[1].firstChild.innerText="1111";
		$('.grid-stack').get(0).children[2].firstChild.innerHTML='<img src="<%=request.getContextPath()%>/common/images/test.png">';
	}
	
	</script>
</body>
</html>