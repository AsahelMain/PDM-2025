package com.example.tarea02;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout cajon;
    private NavigationView navView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catalogo);

        Toolbar barra = findViewById(R.id.toolbar);
        setSupportActionBar(barra);

        cajon = findViewById(R.id.drawerLayout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, cajon, barra,
                R.string.abrir_cajon, R.string.cerrar_cajon);
        cajon.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navView = findViewById(R.id.navView);
        navView.setNavigationItemSelectedListener(item -> {
            int id = item.getItemId();

            if (id == R.id.nav_inicio) {
                Log.d("DrawerToyStoree", "Inicio");
                Toast.makeText(this, "Inicio", Toast.LENGTH_SHORT).show();
            } else if (id == R.id.nav_carrito) {
                Log.d("DrawerToyStoree", "Carrito");
                Toast.makeText(this, "Carrito", Toast.LENGTH_SHORT).show();
            } else if (id == R.id.nav_perfil) {
                Log.d("DrawerToyStoree", "Perfil");
                Toast.makeText(this, "Perfil", Toast.LENGTH_SHORT).show();
            }

            cajon.closeDrawers();
            return true;
        });
    }

    // Metodo para inflar el menú de opciones en la toolbar
    @Override
    public boolean onCreateOptionsMenu(@NonNull android.view.Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return true;
    }

    // Metodo para contestar los clicks en las opciones del menú de tres puntitos
    @Override
    public boolean onOptionsItemSelected(@NonNull android.view.MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.buscar) {
            Log.d("ActionBarToyStoree", "Buscar");
            Toast.makeText(this, "Buscar", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.action_informacion) {
            Log.d("ActionBarToyStoree", "Información");
            Toast.makeText(this, "Información", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.action_ajustes) {
            Log.d("ActionBarToyStoree", "Ajustes");
            Toast.makeText(this, "Ajustes", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.action_ayuda) {
            Log.d("ActionBarToyStoree", "Ayuda");
            Toast.makeText(this, "Ayuda", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}




