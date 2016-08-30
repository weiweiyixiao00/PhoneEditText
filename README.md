# PhoneEditText
Formating a phone number

  Edit把手机号自动格式化为3-4-4格式，分隔符可自定义
  
  <com.rntest.phoneedittext.PhoneEditText
        android:id="@+id/phoneEdit"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="30dp"
        android:layout_marginLeft="3dp"
        android:layout_marginRight="3dp"
        android:background="@null"
        android:hint="请输入手机号"
        android:inputType="phone"
        android:singleLine="true"
        android:text=""
        app:dividerString="-"/>
        
  获取手机号调用editText.getTextString()方法

