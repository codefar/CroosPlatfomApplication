include "base.thrift"

namespace java com.greenleaf.erp.api

const i32 MATHPATH = 256

typedef i16 short
typedef i32 int  
typedef i64 long

struct Student { 
   1: string name
} 

struct Sku { 
   1: string name,
   2: set<string> comments,
   3: optional string comment,
} 

enum Operation {
   ADD = 1,
   SUBTRACT = 2,
   MULTIPLY = 3,
   DIVIDE = 4
}

struct SideDish {
   1: string name,
   2: optional string comment,
} 

struct Spu {
	1: i32 spuId,
	2: i64 price,
	3: bool weight,
	4: double size,
	5: map<string, string> attrs,
	6: list<Sku> skus,
	7: optional string comment,
	8: set<string> comments,
}

exception KeyNotFound {
  1: i32 whatOp,
  2: string why
}

exception InvalidOperation {
    1: i32 whatOp,
    2: string why
}

service ErpService {
	list<Spu> getSpus() throws (1:InvalidOperation io, 2:KeyNotFound knf);
	oneway void addSpu(1: Spu spuStruct);
}