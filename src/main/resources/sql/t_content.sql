/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80036 (8.0.36)
 Source Host           : localhost:3306
 Source Schema         : mydb

 Target Server Type    : MySQL
 Target Server Version : 80036 (8.0.36)
 File Encoding         : 65001

 Date: 05/01/2026 13:27:44
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_content
-- ----------------------------
DROP TABLE IF EXISTS `t_content`;
CREATE TABLE `t_content`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '内容id',
  `user_id` bigint NOT NULL COMMENT '作者ID',
  `like_count` int NULL DEFAULT 0 COMMENT '点赞数',
  `content_title` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '内容标题',
  `content_desc` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '内容描述',
  `create_time` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `fk_content_user`(`user_id` ASC) USING BTREE,
  CONSTRAINT `fk_content_user` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '内容表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_content
-- ----------------------------
INSERT INTO `t_content` VALUES (1, 1, 3, '天气预报', '今天天气好', '2026-01-05 12:41:24', '2026-01-05 12:41:24');
INSERT INTO `t_content` VALUES (2, 2, 2, '美食', '好吃', '2026-01-05 12:43:24', '2026-01-05 12:43:24');

SET FOREIGN_KEY_CHECKS = 1;
