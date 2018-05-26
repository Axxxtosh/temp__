package com.uriahsolution.sms.ui.notification;





import android.arch.lifecycle.Lifecycling;
import android.os.Bundle;






import java.util.Date;

public class NotificationActivity extends Lifecycling {

    public static final String WEATHER_ID_EXTRA = "WEATHER_ID_EXTRA";

    /*
     * This field is used for data binding. Normally, we would have to call findViewById many
     * times to get references to the Views in this Activity. With data binding however, we only
     * need to call DataBindingUtil.setContentView and pass in a Context and a layout, as we do
     * in onCreate of this class. Then, we can access all of the Views in our layout
     * programmatically without cluttering up the code with findViewById.
     */



    private NotificationViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       // mDetailBinding = DataBindingUtil.setContentView(this, R.layout.activity_notification);
        long timestamp = getIntent().getLongExtra(WEATHER_ID_EXTRA, -1);
        Date date = new Date(timestamp);

        // Get the ViewModel from the factory
      //  DetailViewModelFactory factory = InjectorUtils.provideDetailViewModelFactory(this.getApplicationContext(), date);
      //  mViewModel = ViewModelProviders.of(this, factory).get(DetailActivityViewModel.class);

        // Observers changes in the WeatherEntry with the id mId
       // mViewModel.getWeather().observe(this, weatherEntry -> {
            // If the weather forecast details change, update the UI
       /*     if (weatherEntry != null) bindWeatherToUI(weatherEntry);
        });
*/
    }




}
