package com.example.myapp1.activities

import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.myapp1.databinding.ActivityCouplesBinding
import com.example.myapp1.registered
import com.google.android.material.tabs.TabLayoutMediator

class CouplesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCouplesBinding
    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCouplesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tabLayout = binding.tabLayout

        val titles = listOf("First", "Second")
        val viewPager: ViewPager2 = binding.viewPager
        viewPager.adapter = ViewPagerAdapter(this)
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = titles[position]
        }.attach()

    }
}

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    private val fragments = arrayListOf<Fragment>(RegistrationFragment(), CoupleListFragment())

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

}
