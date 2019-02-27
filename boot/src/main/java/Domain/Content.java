package Domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "content")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Content implements Serializable {
}
