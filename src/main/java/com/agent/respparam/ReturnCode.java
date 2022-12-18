package com.agent.respparam;

public class ReturnCode {

    /**
     * 正常
     */
    public final static int NORMAL_SUCC = 200;

    /**
     * 服务端异常
     */
    public final static int SERVER_ERROR = 500;

    /**
     * 客户端异常
     */
    public final static int CLIENT_ERROR = 400;

    /**
     * 用户不存在
     */
    public final static int USER_NOT_EXIST = 101;

    /**
     * 验证码错误
     */
    public final static int VERIFICATION_CODE_ERROR = 102;

    /**
     * 微信已经存在
     */
    public final static int WX_ALREADY_EXIST = 103;

    /**
     * 手机已经被绑定
     */
    public final static int TEL_NUM_ALREADY_EXIST = 104;

    /**
     * 非法调用接口
     */
    public final static int ILLEGAL_REQ_SERVICE = 105;

    /**
     * 未登录
     */
    public final static int NOT_LOGIN = 110;

    /**
     * 账号已注销
     */
    public final static int ACCOUNT_CANCELLED = 111;

    /**
     * 用户账号被拉黑
     */
    public final static int USER_ACCOUNT_SET_BLACK = 401;

    /**
     * 用户拉黑，已提出申诉
     */
    public final static int USER_ACCOUNT_SET_BLACK_APPEAL = 402;

    /**
     * 用户拉黑默认返回码
     */
    public final static int USER_DEFAULT_BLACK = 403;

    /**
     * 用户设备被拉黑
     */
    public final static int DEVICE_SET_BLACK = 405;

    /**
     * 设备拉黑，已提出申诉
     */
    public final static int DEVICE_SET_BLACK_APPEAL = 406;

    /**
     * 用户定时拉黑
     */
    public final static int USER_ACCOUNT_SET_FIX_TIME_BLACK = 407;

    /**
     * 用户被拉黑
     */
    public final static int USER_IS_BLACK = 408;

    /**
     * 用户未实名认证
     */
    public final static int USER_REAL_NAME_NOT_AUTH = 409;

    /**
     * 用户id不存在
     */
    public final static int USER_ID_NOT_EXIST = 410;

    /**
     * 用户权限错误
     */
    public final static int USER_AUTH_ERROR = 411;

    /**
     * 参数为空
     */
    public final static int PARAM_NULL_ERROR = 412;

    /**
     * 用户已经加入过组局
     */
    public final static int GROUP_JOINED = 413;

    /**
     * 组局人数已满
     */
    public final static int GROUP_USER_FULL = 414;

    /**
     * 组局女玩家已满
     */
    public final static int GROUP_FEMALE_USER_FULL = 415;

    /**
     * 组局男玩家已满
     */
    public final static int GROUP_MALE_USER_FULL = 416;

    /**
     * 组局已删除
     */
    public final static int GROUP_DELETED = 417;

    /**
     * 组局已过期
     */
    public final static int GROUP_OVERDUE = 418;

    /**
     * 商家已关闭
     */
    public final static int GROUP_CLOSED = 419;

    /**
     * 商家已封车
     */
    public final static int GROUP_CLOSEINGCAR = 420;

    /**
     * 该帖子已被删除
     */
    public final static int USER_TOPIC_DELETE_CODE = 421;

    /**
     * 签名字数不符合长度限制
     */
    public final static int UPDATE_USERBASE_ERROR = 422;

    /**
     * 评论或回复不符合长度限制
     */
    public final static int REVIEW_OR_REPLY_CODE = 423;

    /**
     * 评论或回复不符合长度限制
     */
    public final static int REVIEW_TOPIC_TEXT_CONTENT_CODE = 424;

    public final static int THEME_SCRIPT_ERROR_CODE = 425;

    /**
     * 用户订单无法取消
     */
    public final static int USER_ORDER_CANNOT_CANCEL = 426;

    /**
     * 用户优惠券已使用
     */
    public final static int USER_COUPON_USE_CODE = 427;

    /**
     * 0元支付 计算金额不为0
     */
    public final static int PAY_AMOUNT_NOT_ZERO = 428;

    /**
     * 用户被指定用户拉黑
     */
    public final static int USER_IN_USER_BLACK_LIST_CODE = 429;

    /**
     * 指定场次为不可加入状态
     */
    public final static int THEME_STAGE_STATUS_BAN_JOIN_CODE= 430;

    /**
     * 指定密室组局为不可加入状态
     */
    public final static int THEME_GROUP_STATUS_BAN_JOIN_CODE= 431;

    /** 入参不合法 */
    public final static int ERROR_PARAM = 501;

    /** 不合法的图片或文字 */
    public final static int ERROR_TEXT_IMG = 502;

    /** 已添加未收录剧本 */
    public final static int ADD_FAIL = 432;

    /** 未达到领取福利条件或已领取 */
    public final static int USER_TALE_TASK_REWARD_FAIL = 433;

    /** 平台剧本不存在 */
    public final static int PLATFORM_SCRIPT_NOT_EXIST_FAIL = 434;

    /** 存在绑定手机号码 */
    public final static int REPEAT_TEL_NUM_FAIL = 435;

    /** 有效批次暂无该剧本 */
    public final static int CODE_BATCH_NOT_HAVE_SCRIPT = 436;

    /**
     * 用户发布自选店铺组局达最大值
     */
    public final static int USER_PUBLISH_SELECT_SHOP_GROUP_REACH_MAX_NUM = 437;
    /**
     * 已经加入过该组局
     */
    public final static int USER_ADD_GROUP_ERROR = 438;

    /**
     * 用户imAccid异常
     */
    public final static int USER_IMACCID_ERROR = 439;

    /**
     * 创建的闪聊群达到最大值
     */
    public final static int USER_CREATE_FLASH_TEAM_REACH_MAX_NUM = 440;

    /**
     * 闪聊群超出发布数据
     */
    public final static int FLASH_TEAM_OVER_PUBLISH_TIME = 441;

    /**
     * 密室已删除
     */
    public final static int THEME_ALREADY_DELETE = 442;

    /**
     * 剧本已删除
     */
    public final static int SCRIPT_ALREADY_DELETE = 443;

    /**
     * 该剧评已被删除
     */
    public final static int SCRIPT_EVALUATE_ALREADY_DELETE = 444;

    /**
     * 不存在用户信息
     */
    public final static int NO_USERINFO_CODE_ERROR = 445;

    /**
     * 今日用户dd打本已达到上限
     */
    public final static int USER_TODAY_RELEASE_DD_SCRIPT_NUMBER_EXHAUSTED = 446;

    /**
     * 筛选条件错误
     */
    public final static int SEARCH_TYPE_ERROR = 447;

    /**
     * 除开订单只能评价一次
     */
    public final static int SHOP_ONLY_CAN_EVALUATE_ONCE_EXCLUDE_ORDER = 448;

    /**
     * 该店铺评价已被删除
     */
    public final static int SHOP_EVALUATE_ALREADY_DELETE = 449;

    /**
     * 用户创建的圈子达到最大数目
     */
    public final static int USER_CREATE_CIRCLE_REACH_MAX = 450;

    /**
     * 圈子不存在
     */
    public final static int CIRCLE_NOT_EXIST = 451;

    /**
     * 圈子的话题超过了置顶的最大数目
     */
    public final static int TOP_CIRCLE_TOPIC_REACH_MAX_NUM = 452;

    /**
     * 用户没有加入圈子
     */
    public final static int USER_NOT_JOIN_TOPIC_CIRCLE = 453;

    /**
     * 用户被圈子禁言
     */
    public final static int USER_FORBIDDEN_WORDS_BY_TOPIC_CIRCLE = 454;

    /**
     * 圈主删除本人动态问题
     */
    public final static int TOPIC_CIRCLE_CREATOR_DEL_MYSELF_ERROR = 455;

    /**
     * 圈子已关闭，不可操作
     */
    public final static int TOPIC_CIRCLE_IS_CLOSED = 456;

    /**
     * 平台已收录，请从平台添加玩过的剧本
     */
    public final static int PLATFORM_ALREADY_COLLECT_SCRIPT = 457;

    /**
     * 发布动态内容不能为空
     */
    public final static int TOPIC_NOT_CONTENT_NULL = 458;

    /**
     * 用户发布自选店铺组局 应缴年费 但未缴年费提示
     */
    public final static int USER_PUBLISH_SELECT_SHOP_GROUP_ANNUAL_FAIL = 459;

    /**
     * 榜单列表需要刷新
     */
    public final static int RANK_LIST_NEED_FLASH = 460;

    /**
     * 提现余额不足
     */
    public final static int WITHDRAW_AMOUNT_NOT_ENOUGH = 461;

    /**
     * 提现没达到最低金额
     */
    public final static int WITHDRAW_NOT_REACH_MIN_AMOUNT = 462;

    /**
     * 提现超过最大金额
     */
    public final static int WITHDRAW_OVER_MAX_AMOUNT = 463;

    /**
     * 请绑定支付宝账户信息
     */
    public final static int PLEASE_BIND_ALI_INFO = 464;

    /**
     * 请绑定微信账户信息
     */
    public final static int PLEASE_BIND_WX_INFO = 465;

    /**
     * 提现今天达到最大次数
     */
    public final static int WITHDRAW_TODAY_REACH_MAX_COUNT = 466;

    /**
     * 店铺已被隐藏
     */
    public final static int SHOP_IS_HIDE_STATUS = 467;

    /**
     * 剧本已被隐藏
     */
    public final static int SCRIPT_ALREADY_HIDE = 468;

    /**
     * 点击频繁异常
     */
    public final static int CLICK_FREQUENT_ERROR = 469;

    /**
     * 今日谜豆使用已达上限
     */
    public final static int USER_SCORE_ERROR = 470;
    /**
     * 谜豆数可使用数超出实际支付占比
     */
    public final static int USER_SCORE_OREDER_ERROR = 471;
    /**
     * 谜豆数可使用数每个组局最大可使用谜豆数
     */
    public final static int USER_SCORE_ONE_OREDER_ERROR = 472;

    public final static int USER_SCORE_OLD_ERROR = 473;

    public final static int SCRIPT_EVALUATE_NULL_ERROR = 474;

    /**
     * 该组局时间段和你已参与的《xxxx》活动时间有重叠，暂时不支持同时上车
     */
    public final static int THIS_PERIOD_HAVE_OTHER_GROUP = 475;
    /**
     * 该圈子已解散～
     */
    public final static int CIRCLE_DISMISS = 476;

    /**
     * 组局已过期，无需申请退款
     */
    public final static int GROUP_OVERDUE_NOT_NEED_APPLY_REFUND = 477;

    /**
     * 组局已经封车
     */
    public final static int GROUP_ALREADY_CLOSED = 478;

    /**
     * 重复加入活动
     */
    public final static int OFFICIAL_ACTIVITY_REPEAT = 479;

    /**
     * 官方活动升级提示
     */
    public final static int OFFICIAL_ACTIVITY_UPGRADE = 480;

    /**
     * 该剧本暂不支持组局
     */
    public final static int SCRIPT_GROUP_ERROR = 481;

    /**
     * 剧本组局标签搜索错误
     */
    public final static int SCRIPT_GROUP_TAG_SEARCH_ERROR = 482;

    /**
     * 该微信已绑定其他账号，请联系组局管家领取打本券
     */
    public final static int WX_BIND_ERROR = 489;

    /**
     * 发现了更新的App版本～快去应用市场升级吧
     *
     * 新版可以查看作者视频、玩家口碑，还能新本快速尝鲜哦～
     */
    public final static int UPDATE_EVALUATE_REPORT_ERROR = 490;

    /**
     *
     * 此微信号已经绑定为其他谜圈账号
     */
    public final static int REPEAT_BIND_WEIXIN = 491;


    /**
     *
     * 此qq已经绑定为其他谜圈账号
     */
    public final static int REPEAT_BIND_QQ = 492;

    /**
     *
     * 此苹果已经绑定为其他谜圈账号
     */
    public final static int REPEAT_BIND_APPLE = 493;

    /**
     * 用户添加常用语超出限制
     */
    public final static int USER_ADD_WORDS_ERROR = 494;

    /**
     * 验证码错误
     */
    public final static int NO_TEL_NUM_ERROR = 495;


    /**
     * 验证码错误
     */
    public final static int MSG_COUPON_SPECIA_ERROR = 496;
}
