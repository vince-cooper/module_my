package com.wangwh.modules.my

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.wangwh.commons.module.base.BaseActivity
import com.wangwh.commons.module.router.RouterIndex
import com.wangwh.modules.my.databinding.ActivityMyBinding

/**
 * 作者: wenhui.w
 * 日期: 2024-10-24 14:31
 * 描述:
 */
@Route(path = RouterIndex.P_MY, name = "我的页面")
class MyActivity : BaseActivity() {

    private lateinit var binding: ActivityMyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backBtn.setOnClickListener {
            finish()
        }

        binding.loginBtn.setOnClickListener {
            ARouter.getInstance().build(RouterIndex.P_LOGIN).navigation()
            finish()
        }

        binding.appBtn.setOnClickListener {
            ARouter.getInstance().build(RouterIndex.P_MAIN).navigation()
            finish()
        }
    }
}