package ro.marianperca.studentsmanager;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Student.class}, version = 1)
public abstract class StudentRoomDatabase extends RoomDatabase {
    private static StudentRoomDatabase INSTANCE;

    static StudentRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(
                    context.getApplicationContext(),
                    StudentRoomDatabase.class,
                    "students_database").build();

        }

        return INSTANCE;
    }

    public abstract StudentDao studentDao();
}
