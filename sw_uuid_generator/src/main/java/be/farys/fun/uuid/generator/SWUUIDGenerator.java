package be.farys.fun.uuid.generator;

import java.util.UUID;

import com.gesmallworld.magik.commons.interop.annotations.ExemplarInstance;
import com.gesmallworld.magik.commons.interop.annotations.MagikExemplar;
import com.gesmallworld.magik.commons.interop.annotations.MagikMethod;
import com.gesmallworld.magik.commons.interop.annotations.Name;
import com.gesmallworld.magik.commons.interop.annotations.Optional;
import com.gesmallworld.magik.interop.MagikInteropUtils;


@MagikExemplar(@Name("sw_uuid_generator"))
public class SWUUIDGenerator {

    @ExemplarInstance
    public static Object initialiseExemplar() {
        return new SWUUIDGenerator();
    }

    /*
     * This method returns a new instance of the generator exemplar
     */
    @MagikMethod("new()")
    public static Object _new(Object self) {
        return initialiseExemplar();
    }

    /**
     * This Method returns a new type-4 UUID
     *
     * @param no parameters
     * @return string value of UUID
     */
    @MagikMethod("get()")
    public final Object get() {
	UUID uid = UUID.randomUUID();
	return MagikInteropUtils.toMagikString(uid.toString());
    }
}
