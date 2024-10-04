package com.example.taller.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.taller.R;
import com.example.taller.clases.Usuario;
import com.squareup.picasso.Picasso;

import java.util.List;

public class UsuarioAdaptador extends RecyclerView.Adapter<UsuarioAdaptador.UsuarioViewHolder> {

    private final List<Usuario> listaUsuarios;

    public UsuarioAdaptador(List<Usuario> listaUsuarios){
        this.listaUsuarios = listaUsuarios;
    }

    @NonNull
    @Override
    public UsuarioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vistaItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_usuario, parent, false);
        return new UsuarioViewHolder(vistaItem);
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioViewHolder holder, int posicion) {
        Usuario usuarioActual = listaUsuarios.get(posicion);
        holder.asignarDatos(usuarioActual);
    }

    @Override
    public int getItemCount() {
        return listaUsuarios.size();
    }

    public static class UsuarioViewHolder extends RecyclerView.ViewHolder {
        private final TextView nombreUsuario;
        private final TextView cursoUsuario;
        private final ImageView imagenUsuario;

        public UsuarioViewHolder(@NonNull View itemView) {
            super(itemView);
            nombreUsuario = itemView.findViewById(R.id.txt_nombre_usuario);
            cursoUsuario = itemView.findViewById(R.id.txt_curso_usuario);
            imagenUsuario = itemView.findViewById(R.id.img_usuario);
        }

        public void asignarDatos(Usuario usuario) {
            nombreUsuario.setText(usuario.getNombreUsuario());
            cursoUsuario.setText(usuario.getNombreCurso());

            // Uso de Picasso para cargar la imagen desde la URL
            Picasso.get().load(usuario.getUrlImagen()).into(imagenUsuario);
        }
    }
}
