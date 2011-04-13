package sement;

import translate.Expr;

class TypedExpr {
    Expr expr;
    type.Type type;

    public TypedExpr(Expr expr, type.Type type) {
        this.expr = expr;
        this.type = type;
    }
}

