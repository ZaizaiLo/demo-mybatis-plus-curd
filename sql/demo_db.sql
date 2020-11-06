/*
 Navicat Premium Data Transfer

 Source Server         : demo
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : localhost:3306
 Source Schema         : demo_db

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 06/11/2020 16:41:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for demo_tb_role
-- ----------------------------
DROP TABLE IF EXISTS `demo_tb_role`;
CREATE TABLE `demo_tb_role`  (
  `ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '角色ID',
  `NAME` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '角色名',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of demo_tb_role
-- ----------------------------
INSERT INTO `demo_tb_role` VALUES ('1', 'ROLE_ADMIN');
INSERT INTO `demo_tb_role` VALUES ('2', NULL);

-- ----------------------------
-- Table structure for demo_tb_user
-- ----------------------------
DROP TABLE IF EXISTS `demo_tb_user`;
CREATE TABLE `demo_tb_user`  (
  `ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '编号',
  `USER_NAME` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '用户名',
  `USER_GENDER` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '性别',
  `NICKNAME` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '昵称',
  `USER_EMAIL` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '邮箱',
  `USER_PHONE` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '手机号码',
  `PASSWORD` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of demo_tb_user
-- ----------------------------
INSERT INTO `demo_tb_user` VALUES ('1', 'admin', NULL, NULL, NULL, NULL, '123456');
INSERT INTO `demo_tb_user` VALUES ('169b09f44262405633e61a7317cafc45', '骆发友', '女', '乐龙以', '2b7m77i7@sina.com', '13200727532', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('49be5e518de6c29796a2433b709b41af', '劳彪星', '女', '倪超', 't7r7rz43n@googlemail.com', '13006357550', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('5cf4f230529d6fe786e0d94f94ee8226', '鱼冰', '女', '闵松保', '0033b73ys@263.net', '15806006026', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('603dcff0b457c31b9cdcf0e775eb9bb1', '胥红娜', '女', '陆慧悦', 'p510z65o@ask.com', '15802987769', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('6413030c026e4cbf09a60bbcce7090e6', '荀琦艺', '男', '门健', 'dc2tqh@sohu.com', '15602631515', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('69d8d353ef786efe1c8465b3308f6fbd', '乔力鹏', '女', '薄乐谦', '5ywh8vpp@sohu.com', '15703314374', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('6d214ab14aa25525ef20b19d967f945a', '薄文', '女', '宓晶欣', 'nnnnl@sohu.com', '13201016719', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('6ebc96c502ec0d47d155941aaec04ec7', '毕秀露', '女', '惠鸣', 'hby722@hotmail.com', '13008072989', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('71259304b9dddb3ff331055913b1e73b', '钟勤融', '女', '赖固琛', 'bk9zkj@163.net', '15003457320', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('717228d5c5ee5e5d412908c9c1aa8e79', '麻黛璧', '女', '裘影悦', 'ucrj1v1ee@aol.com', '15607424670', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('7ca1fadcddd7318f6977744ba4ea1c21', '乔克', '男', '史祥辰', 'z884yt@msn.com', '13900657508', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('7e188e157e50ff2b0ed2bdcf030abdc6', '刘雁玉', '男', '易义辉', 'ug9b80k5p@263.net', '15007311565', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('823ef014fae209a48d2a9954477444eb', '张黛雪', '女', '宫蕊', 'szfqa@yahoo.com.cn', '13603900202', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('8fdca7f8d816e3889f33b04bb1ce8dfa', '毛乐', '女', '皮启功', 'evp5g@263.net', '13200324393', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('99a3b267428a0b6b2048198ded69e1ac', '费固壮', '男', '马时', 'g649xsi7l@aol.com', '15807067013', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('9b81798cde8713ae11d952399f405371', '沃雄富', '女', '薄国', 'dqtfxyc@yahoo.com.cn', '15106377211', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('9f5153965ea2d769dfd0e3c914c23447', '蓟会', '女', '宿娣素', 'gisto@googlemail.com', '13007001876', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('a3656ec97064e5ba518fad83dce677e6', '雍玲琬', '女', '昌启', 'hj2t3oq@live.com', '13604967058', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('ab50c7149091c93c97e9828850f22a38', '蓝发', '男', '拓萍', 'cutmw@googlemail.com', '13002658401', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('ae1e42d5ad9edee1e7ebd8acd6526346', '台园', '男', '门惠娜', 'zxojmx@yeah.net', '13804090575', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('b57c04e7f81a0f4f34ca03ad5df9982e', '罗善', '男', '东素苑', 'u008ep039@3721.net', '13404025526', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('b83c1dd0c5eb90b76cfe6a3bfe2847e5', '桑可荣', '男', '刁壮', '03tb5qf3@126.com', '13400456329', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('c5c7b6290f72db8cecada103390bd6cf', '申坚', '女', '童和', 'kk1b84ww@yeah.net', '13908685771', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('cbcde140bcbba1bd44ec3a67bc429474', '方惠', '男', '幸仪媛', '3a7h1@ask.com', '13306402665', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('da9ee19b074ba9e1ef9d86c50cf8ccd3', '于振德', '男', '谷子', 'ft6vns@163.com', '15202592477', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('e9943278bccdc31c8027aaebaa62afe6', '赫韵琰', '女', '朱羽洁', 'kkdx2bzeh@0355.net', '13608654755', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('ecb37ac88d6dbdb31669727cf2aa0b43', '芮弘炎', '女', '伊朋', 'vre0474c8@aol.com', '13700310256', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('ed93f1e04d41bee7f8c894dbbbd1a195', '扈洁燕', '女', '毕进', '3oi6pxk67@yahoo.com.cn', '15802725996', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('f032b5da82a889b22532a0ab7884ea02', '咎眉瑾', '女', '须仁', 'xjgsm@yahoo.com.cn', '15206282342', 'd3b1294a61a07da9b49b6e22b2cbd7f9');
INSERT INTO `demo_tb_user` VALUES ('f7d40dbe462539528e24892b728058f0', '甫枝嘉', '女', '师伦浩', 'kayrjht@126.com', '15804656394', 'd3b1294a61a07da9b49b6e22b2cbd7f9');

-- ----------------------------
-- Table structure for demo_tb_user_role
-- ----------------------------
DROP TABLE IF EXISTS `demo_tb_user_role`;
CREATE TABLE `demo_tb_user_role`  (
  `ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `USER_ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ROLE_ID` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`ID`, `USER_ID`, `ROLE_ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of demo_tb_user_role
-- ----------------------------
INSERT INTO `demo_tb_user_role` VALUES ('1', '1', '1');
INSERT INTO `demo_tb_user_role` VALUES ('2', '2', '2');
INSERT INTO `demo_tb_user_role` VALUES ('3', '169b09f44262405633e61a7317cafc45', '1');

SET FOREIGN_KEY_CHECKS = 1;
