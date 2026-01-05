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

 Date: 05/01/2026 13:27:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_activity
-- ----------------------------
DROP TABLE IF EXISTS `t_activity`;
CREATE TABLE `t_activity`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` int NOT NULL COMMENT '用户id',
  `activity_type` tinyint NOT NULL COMMENT '互动类型：1-点赞，2-评论',
  `activity_time` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '互动时间',
  `content_id` int NULL DEFAULT NULL COMMENT '关联内容ID（可选）',
  `create_time` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `idx_user_activity`(`user_id` ASC, `activity_time` ASC) USING BTREE COMMENT '用户+互动时间索引',
  INDEX `idx_activity_time`(`activity_time` ASC) USING BTREE COMMENT '互动时间索引',
  CONSTRAINT `fk_activity_user` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '用户互动行为表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_activity
-- ----------------------------
INSERT INTO `t_activity` VALUES (1, 1, 1, '2026-01-05 12:42:38', 1, '2026-01-05 12:42:38', '2026-01-05 12:42:38');
INSERT INTO `t_activity` VALUES (2, 2, 2, '2026-01-05 12:43:27', 2, '2026-01-05 12:43:27', '2026-01-05 12:43:27');

SET FOREIGN_KEY_CHECKS = 1;
