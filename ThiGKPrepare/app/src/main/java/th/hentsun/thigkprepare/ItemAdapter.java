package th.hentsun.thigkprepare;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private Context context;
    private List<Item> itemList;
    public ItemAdapter(Context context, List<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }
    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder holder, int position) {
        Item item = itemList.get(position);
        holder.itemTitle.setText(item.getTitle());
        holder.itemImage.setImageResource(item.getImageResId());

        // Bắt sự kiện click item
        holder.itemView.setOnClickListener(v -> {
//            Intent intent = new Intent(context, ItemActivity.class);
//            intent.putExtra("title", item.getTitle());
//            intent.putExtra("image", item.getImageResId());
//            context.startActivity(intent);
            Toast.makeText(context, "Bạn đã chọn: " + item.getTitle(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView itemTitle;
        ImageView itemImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemTitle = itemView.findViewById(R.id.item_title);
            itemImage = itemView.findViewById(R.id.item_image);
        }
    }
}
