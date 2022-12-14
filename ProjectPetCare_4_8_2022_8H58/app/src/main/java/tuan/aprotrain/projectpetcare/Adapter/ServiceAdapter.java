package tuan.aprotrain.projectpetcare.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import tuan.aprotrain.projectpetcare.R;
import tuan.aprotrain.projectpetcare.entity.Service;

public class ServiceAdapter extends ArrayAdapter {
    private Activity Context;
    List<Service> usersList;
    public ServiceAdapter(Activity Context,List<Service> usersList){
        super(Context, R.layout.list_service, usersList);
        this.Context=Context;
        this.usersList = usersList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater inflater=Context.getLayoutInflater();
        View listItemView=inflater.inflate(R.layout.list_user,null,true);

        TextView id = listItemView.findViewById(R.id.serviceId);
        TextView name = listItemView.findViewById(R.id.serviceName);
        TextView price = listItemView.findViewById(R.id.servicePrice);
        TextView time = listItemView.findViewById(R.id.serviceTime);
        TextView categoryId = listItemView.findViewById(R.id.categoryId);
        //ImageView img=listItemView.findViewById(R.id.img1);

        Service service = usersList.get(position);
        id.setText((int) service.getServiceId());
        name.setText(service.getServiceName());
        price.setText((int) service.getServicePrice());
        time.setText((int) service.getServiceTime());
        categoryId.setText(service.getCategoryId());

        return listItemView;
    }
}