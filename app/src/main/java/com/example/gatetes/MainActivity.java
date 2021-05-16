package com.example.gatetes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.gatetes.Clases.Gatetes;
import com.example.gatetes.WebServiceClient.WebServiceClient;
import com.example.gatetes.adapters.GatetesAdapter;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private List<Gatetes> gatetes;
    private GatetesAdapter adapter;
    private LinearLayoutManager manager;
    WebServiceClient webServiceClient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupView();
        initRetrofit();
        setupView();
        lanzarPeticion();

    }

    private void initRetrofit() {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder().addInterceptor(loggingInterceptor);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(WebServiceClient.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClientBuilder.build())
                .build();
        webServiceClient = retrofit.create(WebServiceClient.class);
    }

    private void lanzarPeticion() {


        Call<List<Gatetes>>peticion = webServiceClient.getRazas();
        peticion.enqueue(new Callback<List<Gatetes>>() {
            @Override
            public void onResponse(Call<List<Gatetes>> call, Response<List<Gatetes>> response) {
                if (response.isSuccessful()) {
                    int code = response.code();

                    adapter.setLista(response.body());
                } else {
                    showErrorMessage();
                }
            }

            @Override
            public void onFailure(Call<List<Gatetes>> call, Throwable t) {
                Log.d("RETROFIT", "Error: " + t.getMessage());
            }
        });
    }

    private void showErrorMessage() {
        Toast.makeText(this, "Ha ocurrido un error desconocido. Por favor, vuelve a intentarlo más tarde.", Toast.LENGTH_SHORT).show();
    }

    private void setupView() {
        RecyclerView recyclerView=findViewById(R.id.recycler1);
        adapter = new GatetesAdapter(this);
        manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);

    }
}