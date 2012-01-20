package com.biosimilarity.lift.lib.kvdbJSON.Absyn; // Java Package generated by the BNF Converter.

public abstract class Message implements java.io.Serializable {
  public abstract <R,A> R accept(Message.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(com.biosimilarity.lift.lib.kvdbJSON.Absyn.KVDBJustReqHB p, A arg);
    public R visit(com.biosimilarity.lift.lib.kvdbJSON.Absyn.KVDBJustReqBH p, A arg);
    public R visit(com.biosimilarity.lift.lib.kvdbJSON.Absyn.KVDBJustRspHB p, A arg);
    public R visit(com.biosimilarity.lift.lib.kvdbJSON.Absyn.KVDBJustRspBH p, A arg);

  }

}
