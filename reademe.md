## SpringBoot VUE 后端模块






## Element引入

el-container: 整个页面框架

el-aside: 构建左侧菜单

el-menu: 左侧菜单内容
    default-openeds: 默认菜单键，通过菜单的Index值关联
    default-active: 默认选中的菜单，通过菜单的index值关联
    
el-submenu: 可展开的菜单，常用属性
    index: 菜单的下标，文本类型，不能是数值类型

template: 对应el-submenu的菜单名
i：设置菜单图标，通过class属性设置
    - el-icon-message
    - el-icon-menu
    - el-cion-setting
el-menu-item: 菜单子节点,不可再展开
    - index 下标
    
 

绑定跳转 

1. 标注true


_this和this的区别



2. router和route的区别


## 后续
1. 引入缓存redis
2. 引入Spring Security
3. 引入swagger测试