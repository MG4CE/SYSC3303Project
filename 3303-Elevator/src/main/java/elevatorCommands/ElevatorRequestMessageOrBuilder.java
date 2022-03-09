// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: elevator.proto

package elevatorCommands;

public interface ElevatorRequestMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:elevatorCommands.ElevatorRequestMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 elevatorID = 1;</code>
   * @return The elevatorID.
   */
  int getElevatorID();

  /**
   * <code>.elevatorCommands.Direction direction = 2;</code>
   * @return The enum numeric value on the wire for direction.
   */
  int getDirectionValue();
  /**
   * <code>.elevatorCommands.Direction direction = 2;</code>
   * @return The direction.
   */
  elevatorCommands.Direction getDirection();

  /**
   * <code>.elevatorCommands.Button button = 3;</code>
   * @return The enum numeric value on the wire for button.
   */
  int getButtonValue();
  /**
   * <code>.elevatorCommands.Button button = 3;</code>
   * @return The button.
   */
  elevatorCommands.Button getButton();

  /**
   * <code>uint32 floor = 4;</code>
   * @return The floor.
   */
  int getFloor();

  /**
   * <code>string timeStamp = 5;</code>
   * @return The timeStamp.
   */
  java.lang.String getTimeStamp();
  /**
   * <code>string timeStamp = 5;</code>
   * @return The bytes for timeStamp.
   */
  com.google.protobuf.ByteString
      getTimeStampBytes();
}
