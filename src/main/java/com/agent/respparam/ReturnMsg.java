package com.agent.respparam;

public class ReturnMsg {
    /**
     * 用户已经加入过组局
     */
    public final static String MSG_GROUP_JOINED = "您已加入过组局";

    /**
     * 组局人数已满
     */
    public final static String MSG_GROUP_USER_FULL = "抱歉，此组局已满，去看看其他组局吧！";

    /**
     * 组局女玩家已满
     */
    public final static String MSG_GROUP_FEMALE_USER_FULL = "抱歉，此本已经不缺女生了，去看看其他组局吧！";

    /**
     * 组局男玩家已满
     */
    public final static String MSG_GROUP_MALE_USER_FULL = "抱歉，此本已经不缺男生了，去看看其他组局吧！";


    /**
     * 组局已删除
     */
    public final static String MSG_GROUP_DELETED = "组局已已删除";

    /**
     * 组局已过期
     */
    public final static String MSG_GROUP_OVERDUE = "组局已过期";

    /**
     * 商家已关闭
     */
    public final static String MSG_GROUP_CLOSED = "商家已关闭";

    /**
     * 商家已封车
     */
    public final static String MSG_GROUP_CLOSEINGCAR = "商家已封车";

    /**
     * 用户信息错误
     */
    public final static String MSG_USER_ERROR = "用户信息错误";

    /**
     * 验证码不正确
     */
    public final static String MSG_VERIFICATION_CODE_ERROR = "验证码不正确";

    /**
     * 成功
     */
    public final static String MSG_SUCC = "成功";

    public final static String MSG_UPDATE_USERBASE_ERROR = "签名字数不符合长度限制";

    /**
     * 评论或回复限制数量
     */
    public final static String MSG_REVIEW_OR_REPLY_ERROR = "评论或回复不符合长度限制1-300字";

    /**
     * 发布话题字数限制
     */
    public final static String MSG_TOPIC_TEXT_CONTENT_ERROR = "发布话题字数不符合长度限制15-2000字";

    public final static String MSG_THEME_SCRIPT_ERROR = "剧本id或者密室不正确";

    /** 优惠券已使用 */
    public final static String MSG_USER_COUPON_USE = "优惠券已使用";

    public final static String MSG_USER_SCORE_ERROR = "今日谜豆使用已达上限";

    /** 用户已被拉黑 */
    public final static String MSG_USER_IN_USER_BLACK_LIST = "你已被该用户拉黑";

    /** 指定场次未不可加入状态 */
    public final static String MSG_THEME_STAGE_STATUS_BAN_JOIN = "指定场次为不可加入状态";

    /** 指定组局为不可加入状态 */
    public final static String MSG_GROUP_STAGE_STATUS_BAN_JOIN = "指定组局为不可加入状态";

    /** 指定组局为不可加入状态 */
    public final static String ERROR_PARAM = "入参不合法";

    /** 已添加未收录剧本 */
    public final static String ADD_FAIL = "该剧本已添加过,不可重复添加";

    /** 未达到领取福利 */
    public final static String USER_TALE_TASK_REWARD_FAIL = "未到领取福利条件或已领取";

    /** 店铺评价字数的提示语 */
    public final static String SHOP_EVALUATE_TEXT_COUNT_LIMIT = "评价最多300个字哦";

    /** 评价的最少次数提示语 */
    public final static String MSG_PLATFORM_SCRIPT_NOT_EXIST = "平台当前未收录该剧本，暂无详情介绍。";

    /** 有效批次暂无该剧本 */
    public final static String MSG_BATCH_NOT_HAVE_SCRIPT = "有效批次暂无该剧本";

    /** 密室已删除 */
    public final static String MSG_THEME_ALREADY_DELETE = "该密室已删除";

    /** 剧本已删除 */
    public final static String MSG_SCRIPT_ALREADY_DELETE = "该剧本已删除";

    /** 该剧评已被删除 */
    public final static String MSG_SCRIPT_EVALUATE_ALREADY_DELETE = "该剧评已被删除";

    /** 发布DD打本成功 */
    public final static String MSG_RELEASE_DD_SCRIPT_SUCCESS = "发布成功～开始为你寻找同城的的组局，响应后将和你联系";

    /** 发布DD打本达到上限 */
    public final static String MSG_RELEASE_DD_SCRIPT_NUMBER_EXHAUSTED = "你发布的DD打本数量已达到今日上限～明天再来吧";

    /** 该店铺评价已被删除 */
    public final static String MSG_SHOP_EVALUATE_ALREADY_DELETE = "该店铺评价已被删除";

    /** 店铺评价字数的最新提示语 */
    public final static String SHOP_EVALUATE_TEXT_COUNT_LIMIT_NEW = "评价最多2000个字哦";

    /**
     * 圈子不存在
     */
    public final static String CIRCLE_NOT_EXIST = "圈子不存在";

    /**
     * 该圈子已解散～
     */
    public final static String CIRCLE_DISMISS = "该圈子已解散～";

    /**
     * 圈子已关闭，不可操作
     */
    public final static String TOPIC_CIRCLE_IS_CLOSED = "该圈子已关闭，暂时不可操作～";

    /** 优惠券已发送完毕 */
    public final static String SHOP_COUPON_NUM_RUN_OUT = "店铺神券已抢光~";

    /** 平台已收录 */
    public final static String PLATFORM_ALREADY_COLLECT_SCRIPT = "平台已收录，请从平台添加玩过的剧本";

    /** 发布动态内容不能为空 */
    public final static String TOPIC_NOT_CONTENT_NULL = "发布动态内容不可为空";


    /** 剧本已被隐藏 */
    public final static String MSG_SCRIPT_ALREADY_HIDE = "该剧本暂不支持查看";

    public final static String MSG_SCORE_OLD_ERROR = "谜豆规则升级，请更新最新版本后使用";

    /** 剧本信息不齐全 */
    public final static String SCRIPTEVALUATE_NULL_ERROR = "剧本信息不齐全";

    /** 该组局时间段和你已参与的《xxxx》活动时间有重叠，暂时不支持同时上车 */
    public final static String THIS_PERIOD_HAVE_OTHER_GROUP = "该组局时间段和你已参与的《scriptName》组局时间有重叠，暂时不支持同时上车";

    public final static String OFFICIAL_ACTIVITY_REPEAT_ERROR = "重复加入活动";

    public final static String OFFICIAL_ACTIVITY_UPGRADE_ERROR = "当前版本过低不支持该功能 ，请前往应用市场升级至谜圈App最新版本后使用。";

    /**
     * 验证码不正确
     */
    public final static String SCRIPT_GROUP_ERROR = "该剧本暂不支持组局";

    /**
     * 发现了更新的App版本
     */
    public final static String UPDATE_EVALUATE_REPORT_ERROR_TEXT = "发现了新的App版本～快去应用市场升级吧！新版可以查看作者视频、玩家口碑，还能新本快速尝鲜哦～";

    /**
     * 此微信号已经绑定为其他谜圈账号
     */
    public final static String REPEAT_BIND_WEIXIN_CODE_ERROR = "此微信账号已绑定其他谜圈账号，你可以登录该账号解绑后重新绑定";

    public final static String REPEAT_BIND_QQ_CODE_ERROR = "此QQ账号已绑定其他谜圈账号，你可以登录该账号解绑后重新绑定";

    public final static String REPEAT_BIND_APPLE_CODE_ERROR = "此苹果账号已绑定其他谜圈账号，你可以登录该账号解绑后重新绑定";

    /**
     * 用户添加常用语超出限制
     */
    public final static String USER_ADD_WORDS_ERROR_TEXT = "最多只能添加十条常用语哦";

    /**
     * 验证码不正确
     */
    public final static String MSG_NO_TEL_NUM_ERROR_ERROR = "无效的客服账号信息";

    /**
     * 急车价的组局不可与优惠券、谜豆叠加使用哦～
     */
    public final static String MSG_COUPON_SPECIA_ERROR_TEXT = "急车价的组局不可与优惠券、谜豆叠加使用哦～";
}
