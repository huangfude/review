/*
Navicat MySQL Data Transfer

Source Server         : review
Source Server Version : 50528
Source Host           : 127.0.0.1:3306
Source Database       : review

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2016-09-04 21:29:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `menu`
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `text` varchar(255) NOT NULL COMMENT '菜单名',
  `parent_id` bigint(32) NOT NULL DEFAULT '0' COMMENT '父类id',
  `href` varchar(255) NOT NULL COMMENT '菜单路径',
  `icon` varchar(255) DEFAULT '' COMMENT 'bootstrap 图标',
  `sort` bigint(1) DEFAULT '0' COMMENT '排序字段',
  `status` tinyint(1) NOT NULL DEFAULT '0' COMMENT '0 - 正常 1 - 失效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', '系统管理', '0', '#', 'glyphicon glyphicon-list', '10', '0');
INSERT INTO `menu` VALUES ('2', '菜单管理', '1', 'menu.htm', '', '12', '0');
INSERT INTO `menu` VALUES ('3', '用户管理', '1', 'user.htm', '', '11', '0');
INSERT INTO `menu` VALUES ('4', '角色管理', '1', 'role.htm', '', '13', '0');

-- ----------------------------
-- Table structure for `permission`
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `permission_mark` varchar(32) NOT NULL DEFAULT '' COMMENT '权限标识字段',
  `permission_des` varchar(32) DEFAULT '' COMMENT '权限描述',
  `permission_type` int(1) DEFAULT NULL COMMENT '权限类别',
  `create_date` bigint(32) DEFAULT NULL COMMENT '创建时间',
  `updete_date` bigint(32) DEFAULT NULL COMMENT '修改时间',
  `menu_id` bigint(32) NOT NULL COMMENT '关联menu表',
  `status` int(1) NOT NULL COMMENT '0 有效 1 无效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10011 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES ('10001', 'add:user', '添加用户', '1', '1472728431007', '1472728448800', '3', '0');
INSERT INTO `permission` VALUES ('10002', 'update:user', '修改用户', '1', '1472728445330', null, '3', '0');
INSERT INTO `permission` VALUES ('10003', 'delete:user', '删除用户', '0', '1472728474692', null, '3', '0');
INSERT INTO `permission` VALUES ('10004', 'select:user', '查询用户', '0', '1472728521513', null, '3', '0');
INSERT INTO `permission` VALUES ('10005', 'add:rootMenu', '添加根目录', '1', '1472728710472', null, '2', '0');
INSERT INTO `permission` VALUES ('10006', 'add:menu', '添加菜单', '1', '1472728732156', null, '2', '0');
INSERT INTO `permission` VALUES ('10007', 'delete:rootMenu', '删除根目录', '1', '1472728756664', null, '2', '0');
INSERT INTO `permission` VALUES ('10008', 'select:menu', '查询菜单', '1', '1472728814600', null, '2', '0');
INSERT INTO `permission` VALUES ('10009', 'update:menu', '修改菜单', '1', '1472728832794', null, '2', '0');
INSERT INTO `permission` VALUES ('10010', 'delete:menu', '删除菜单', '1', '1472728852386', null, '2', '0');

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_name` varchar(32) NOT NULL DEFAULT '' COMMENT '角色名',
  `role_code` varchar(32) NOT NULL DEFAULT '' COMMENT '角色编码',
  `role_des` varchar(32) NOT NULL DEFAULT '' COMMENT '角色描述',
  `status` int(1) NOT NULL COMMENT '0 有效 1 无效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '超级管理员', 'SUPERADMIN', '超级管理员', '0');
INSERT INTO `role` VALUES ('2', '管理员', 'ADMIN', '管理员', '0');
INSERT INTO `role` VALUES ('3', '普通用户', 'GENER', '普通用户', '0');

-- ----------------------------
-- Table structure for `role_menu`
-- ----------------------------
DROP TABLE IF EXISTS `role_menu`;
CREATE TABLE `role_menu` (
  `id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_id` bigint(32) NOT NULL COMMENT '角色ID',
  `menu_id` bigint(32) NOT NULL COMMENT '菜单ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_menu
-- ----------------------------
INSERT INTO `role_menu` VALUES ('24', '1', '1');
INSERT INTO `role_menu` VALUES ('25', '1', '2');
INSERT INTO `role_menu` VALUES ('26', '1', '3');
INSERT INTO `role_menu` VALUES ('27', '1', '4');
INSERT INTO `role_menu` VALUES ('28', '2', '1');
INSERT INTO `role_menu` VALUES ('29', '2', '2');

-- ----------------------------
-- Table structure for `role_permission`
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission` (
  `id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_id` bigint(32) NOT NULL COMMENT '角色ID',
  `permission_id` bigint(32) NOT NULL COMMENT '权限ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=87 DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '用户主键',
  `role_code` varchar(32) DEFAULT NULL COMMENT '角色ID',
  `user_name` varchar(32) NOT NULL COMMENT '用户名',
  `password` varchar(32) NOT NULL COMMENT '用户密码',
  `name` varchar(32) DEFAULT NULL COMMENT '用户姓名',
  `type` int(1) NOT NULL DEFAULT '0' COMMENT '用户类别 0系统用户 1普通用户',
  `head` varchar(255) DEFAULT NULL COMMENT '用户头像地址',
  `qq` varchar(32) DEFAULT NULL,
  `email` varchar(32) DEFAULT NULL,
  `gender` int(1) DEFAULT '0' COMMENT '0 - 女 1 - 男',
  `note` varchar(255) DEFAULT '' COMMENT '说明',
  `create_time` bigint(20) DEFAULT NULL,
  `update_time` bigint(20) DEFAULT NULL,
  `status` int(1) NOT NULL DEFAULT '0' COMMENT '用户状态 0正常 1失效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'SUPERADMIN', 'admin', '123456', 'admin', '0', null, '137080253', '137080253@qq.com', '1', '', null, '1472285948987', '1');
