package chathealth.chathealth.entity.chatRoom;

import chathealth.chathealth.dto.request.CreateChatRoom;
import chathealth.chathealth.entity.ChatRoomMember;
import chathealth.chathealth.entity.member.Member;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ChatRoom {

    @Id
    @GeneratedValue(strategy = SEQUENCE)
    @Column(name = "room_id")
    private Long id;

    private String name;

    private String description;

    private String roomImage;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member representativeMember;

    @OneToMany(mappedBy = "chatRoom", cascade = CascadeType.ALL)
    private List<ChatRoomMember> chatRoomMembers = new ArrayList<>();

    public int getMembers() {
        return chatRoomMembers.size();
    }

    @Builder
    public ChatRoom(String name, String description, String roomImage, Member representativeMember) {
        this.name = name;
        this.description = description;
        this.roomImage = roomImage;
        this.representativeMember = representativeMember;
    }

    public static ChatRoom createChatRoom(CreateChatRoom createChatRoom, Member member, String roomImage) {
        return ChatRoom.builder()
                        .name(createChatRoom.getName())
                        .roomImage(roomImage)
                        .description(createChatRoom.getDescription())
                        .representativeMember(member)
                        .build();
    }
}