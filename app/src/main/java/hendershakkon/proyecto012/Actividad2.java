package hendershakkon.proyecto012;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Actividad2 extends AppCompatActivity {
    WebView web1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        web1 = (WebView)findViewById(R.id.web1);

        Bundle bundle = getIntent().getExtras();
        String dato=bundle.getString("direccion");
        web1.loadUrl("http://" + dato);
    }

    // este método se ejecuta al presionar el boton finalizar
    public void finalizar(View view){
        finish();
    }
}
