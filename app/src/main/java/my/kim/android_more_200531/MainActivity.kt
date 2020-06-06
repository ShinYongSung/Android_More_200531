package my.kim.android_more_200531

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
        moveBtn
        )
    }

    override fun onResume() {
        super.onResume()

        Log.d("메인화면", "onResume실행")
    }

    override fun onPause() {
        super.onPause()
        Log.d("메인화면", "onpause실행")
    }

    override fun onStop() {
        super.onStop()
        Log.d("메인화면", "onstop실행")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("메인화면", "onpdestory실행")
    }

    override fun setValues() {

        val users = ArrayList<String>()
        users.add("조경진")
        users.add("아이유")
        users.add("박보검")
        users.add("차은우")
        users.add("박보영")

        for (u in users) {
            Log.d("사용자이름", u)
        }

        for (i in 0..5)
            Log.d("숫자반복", "${i}")

    }


}
